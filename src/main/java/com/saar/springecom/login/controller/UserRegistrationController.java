package com.saar.springecom.login.controller;

import com.saar.springecom.login.dto.UserDetailsDto;
import com.saar.springecom.login.model.UserDetails;
import com.saar.springecom.login.service.impl.IUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/v1")
public class UserRegistrationController {

    @Autowired
    IUserDetails iUserDetails;

    @Autowired
    UserDetails userDetails;

    @Autowired
    UserDetailsDto userDetailsDto;


    @PostMapping("/saveUserDetails")
    public String userRegistration(@Valid @ModelAttribute("userDetail") UserDetailsDto userDetailsDto,
                                   BindingResult bindingResult, Model model){

        System.out.println("Checking the bindingresult" +bindingResult.hasErrors());

        if (bindingResult.hasErrors()) return "registration";
        else {

            iUserDetails.setUserDetail(userDetailsDto, userDetails);
            model.addAttribute("new_userDetail", userDetailsDto);
            iUserDetails.save(userDetails);
            return "login";
        }
    }

    @RequestMapping("/registration")
    public String regPage(){
        //populateUser();
        return "registration";
    }


    @ModelAttribute("userDetail")
    public UserDetailsDto populateUser(){
        UserDetailsDto userDetailsDto = new UserDetailsDto();
        return userDetailsDto;
    }


}
