package com.saar.springecom.login.service;

import com.saar.springecom.login.model.Authorities;
import com.saar.springecom.login.model.Authorities;

import java.util.List;
import java.util.Optional;

public interface IAuthorities {
    public Authorities save(Authorities authorities);
    public List<Authorities> saveAll(Iterable<Authorities> entities);
    public Optional<Authorities> findById(String id);
    public boolean existsById(String id);
    public List<Authorities> findAll();
    public List<Authorities> findAllById(List<String> ids);
    public long count();
    public void deleteById(String emailId);
    public void delete(Authorities entity);
    public void deleteAll(List<Authorities> authorities);
    public void deleteAll();
}
