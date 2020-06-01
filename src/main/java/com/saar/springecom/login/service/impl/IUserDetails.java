package com.saar.springecom.login.service.impl;


import com.saar.springecom.login.dto.UserDetailsDto;
import com.saar.springecom.login.model.UserDetails;

import java.util.List;
import java.util.Optional;

public interface IUserDetails {


    public UserDetails save(UserDetails userDetails);
    public List<UserDetails> saveAll(Iterable<UserDetails> entities);
    public Optional<UserDetails> findById(Integer id);
    public boolean existsById(Integer id);
    public List<UserDetails> findAll();
    public List<UserDetails> findAllById(List<Integer> integers);
    public long count();
    public void deleteById(Integer integer);
    public void delete(UserDetails entity);
    public void deleteAll(List<UserDetails> userDetails);
    public void deleteAll();

    default  public void setUserDetail(UserDetailsDto userDetailsDto, UserDetails userDetails){
        userDetails.setAddress(userDetailsDto.getAddress());
        userDetails.setDob(userDetailsDto.getDob());
        userDetails.setEmailId(userDetailsDto.getEmailId());
        userDetails.setPri_contact_no(userDetailsDto.getPri_contact_no());
        userDetails.setSec_contact_no(userDetailsDto.getSec_contact_no());
        userDetails.setName(userDetailsDto.getName());
    }
}
