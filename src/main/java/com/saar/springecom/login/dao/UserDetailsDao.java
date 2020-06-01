package com.saar.springecom.login.dao;

import com.saar.springecom.login.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsDao extends JpaRepository<UserDetails,Integer> {

}
