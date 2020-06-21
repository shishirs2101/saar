package com.saar.springecom.login.controller;

import com.saar.springecom.constants.URLConstant;
import com.saar.springecom.login.dto.UserDetailsDto;
import com.saar.springecom.login.model.Authorities;
import com.saar.springecom.login.model.UserDetails;
import com.saar.springecom.login.service.impl.IUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/v1")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    IUserDetails iUserDetails;

    @Autowired
    UserDetails userDetails;

    @Autowired
    Authorities authorities;

    @PostMapping("/saveUserDetails")
    public String userRegistration(@Valid @ModelAttribute("userDetail") UserDetailsDto userDetailsDto,
                                   BindingResult bindingResult, Model model) {
        logger.info("Saving user details {}", userDetailsDto.toString());

        if (bindingResult.hasErrors()) return URLConstant.REG.getVal();
        else {
            setUserDetail(userDetailsDto);
            logger.info("Persist user details  {}", userDetails.toString());
            iUserDetails.save(userDetails);
            return URLConstant.LOGIN.getVal();
        }
    }

    @GetMapping("/registration")
    public String regPage() {
        return URLConstant.REG.getVal();
    }

    @RequestMapping("/login")
    public String loginPage() {
        return URLConstant.LOGIN.getVal();
    }


    @GetMapping("/dashboard")
    public String dashboard() {
        return URLConstant.DASHBOARD.getVal();
    }


    @ModelAttribute("userDetail")
    public UserDetailsDto populateUser() {
        UserDetailsDto userDetailsDto = new UserDetailsDto();
        return userDetailsDto;
    }


    private void setUserDetail(UserDetailsDto userDetailsDto) {
        authorities.setEmailId(userDetailsDto.getEmailId());
        authorities.setAuthority(userDetailsDto.getRole());
        userDetails.setName(userDetailsDto.getName());
        userDetails.setAddress(userDetailsDto.getAddress());
        userDetails.setDob(userDetailsDto.getDob());
        userDetails.setEmailId(userDetailsDto.getEmailId());
        userDetails.setPri_contact_no(userDetailsDto.getPri_contact_no());
        userDetails.setSec_contact_no(userDetailsDto.getSec_contact_no());
        userDetails.setPassword(userDetailsDto.getPassword());
        userDetails.setAuthorities(authorities);

    }


}
