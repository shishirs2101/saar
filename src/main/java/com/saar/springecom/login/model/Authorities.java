package com.saar.springecom.login.model;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
@Component
public class Authorities {

    @Id
    @Column(name = "email_id")
    private String emailId;

    @Column(name = "authority")
    private String authority;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "Authorities{" +
                "emailId='" + emailId + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }
}
