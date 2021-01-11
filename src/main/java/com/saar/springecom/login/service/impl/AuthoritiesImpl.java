package com.saar.springecom.login.service.impl;

import com.saar.springecom.login.dao.AuthoritiesDao;
import com.saar.springecom.login.model.Authorities;
import com.saar.springecom.login.service.IAuthorities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AuthoritiesImpl implements IAuthorities {

    @Autowired
    AuthoritiesDao authoritiesDao;

    @Override
    public Authorities save(Authorities authorities) {
        return authoritiesDao.save(authorities);
    }
    @Override
    public List<Authorities> saveAll(Iterable<Authorities> entities) {
        return authoritiesDao.saveAll(entities);
    }
    @Override
    public Optional<Authorities> findById(String id) {
        Optional<Authorities> byId = findById(id);
        return byId.isPresent()? Optional.empty() :byId;
    }
    @Override
    public boolean existsById(String emailId) {
        return authoritiesDao.existsById(emailId);
    }
    @Override
    public List<Authorities> findAll() {
        return authoritiesDao.findAll();
    }
    @Override
    public List<Authorities> findAllById(List<String> emailIds) {
        return authoritiesDao.findAllById(emailIds);
    }
    @Override
    public long count() {
        return authoritiesDao.count();
    }
    @Override
    public void deleteById(String emailId) {
        authoritiesDao.deleteById(emailId);
    }
    @Override
    public void delete(Authorities entity) {
        authoritiesDao.delete(entity);
    }
    @Override
    public void deleteAll(List<Authorities> authorities) {
        authoritiesDao.deleteAll(authorities);
    }
    @Override
    public void deleteAll() {
        authoritiesDao.deleteAll();
    }

}
