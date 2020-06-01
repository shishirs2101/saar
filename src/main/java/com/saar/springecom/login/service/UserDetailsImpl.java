package com.saar.springecom.login.service;

import com.saar.springecom.login.dao.UserDetailsDao;
import com.saar.springecom.login.dto.UserDetailsDto;
import com.saar.springecom.login.model.UserDetails;
import com.saar.springecom.login.service.impl.IUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserDetailsImpl implements IUserDetails {

    @Autowired
    UserDetailsDao userDetailsDao;

    @Override
    public UserDetails save(UserDetails userDetails) {
        return userDetailsDao.save(userDetails);
    }
    @Override
    public List<UserDetails> saveAll(Iterable<UserDetails> entities) {
        return userDetailsDao.saveAll(entities);
    }
    @Override
    public Optional<UserDetails> findById(Integer id) {
        Optional<UserDetails> byId = findById(id);
        return byId.isEmpty()? Optional.empty() :byId;
    }
    @Override
    public boolean existsById(Integer id) {
        return userDetailsDao.existsById(id);
    }
    @Override
    public List<UserDetails> findAll() {
        return userDetailsDao.findAll();
    }
    @Override
    public List<UserDetails> findAllById(List<Integer> integers) {
        return userDetailsDao.findAllById(integers);
    }
    @Override
    public long count() {
        return userDetailsDao.count();
    }
    @Override
    public void deleteById(Integer integer) {
        userDetailsDao.deleteById(integer);
    }
    @Override
    public void delete(UserDetails entity) {
        userDetailsDao.delete(entity);
    }
    @Override
    public void deleteAll(List<UserDetails> userDetails) {
        userDetailsDao.deleteAll(userDetails);
    }
    @Override
    public void deleteAll() {
        userDetailsDao.deleteAll();
    }

}
