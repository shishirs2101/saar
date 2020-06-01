package com.saar.springecom.login.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="user_details")
@Component
public class UserDetails {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
