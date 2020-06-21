package com.saar.springecom.login.dao;

import com.saar.springecom.login.model.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesDao  extends JpaRepository<Authorities,String> {
}
