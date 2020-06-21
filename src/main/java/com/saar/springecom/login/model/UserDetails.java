package com.saar.springecom.login.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="user_details")
@Component
public class UserDetails {

    @Transient
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "email_id")
    private String emailId;

    @Column(name = "pri_contact_no")
    private String pri_contact_no;

    @Column(name = "sec_contact_no")
    private String sec_contact_no;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "address")
    private String address;

    @Column(name = "password")
    private String password;


    @JoinColumn(name = "role_id",referencedColumnName = "email_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Authorities authorities;

    public Authorities getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Authorities authorities) {
        this.authorities = authorities;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password =passwordEncoder.encode(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPri_contact_no() {
        return pri_contact_no;
    }

    public void setPri_contact_no(String pri_contact_no) {
        this.pri_contact_no = pri_contact_no;
    }

    public String getSec_contact_no() {
        return sec_contact_no;
    }

    public void setSec_contact_no(String sec_contact_no) {
        this.sec_contact_no = sec_contact_no;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "UserDetails{" +
                "passwordEncoder=" + passwordEncoder +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", pri_contact_no='" + pri_contact_no + '\'' +
                ", sec_contact_no='" + sec_contact_no + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", authorities_emailId=" + authorities.getEmailId() +
                ", authorities_role=" + authorities.getAuthority() +
                '}';
    }
}
