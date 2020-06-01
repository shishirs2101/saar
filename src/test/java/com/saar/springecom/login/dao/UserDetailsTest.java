package com.saar.springecom.login.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

class UserDetailsTest {

    @Autowired
    DataSource dataSource;

    @BeforeEach
    void setUp() {
    }
    @Test
    public void checkDbConnection(){
        DataSourceUtils.getConnection(dataSource);

    }
}