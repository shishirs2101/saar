package com.saar.springecom.login.dto;


import com.saar.springecom.annotations.ValidPassword;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.Date;


@Component
public class UserDetailsDto {

    @NotNull(message = "Provide the Full Name")
    @NotBlank(message = "Provide the Full Name")
    private String name;

    @Email(message = "Invalid email id")
    @NotBlank(message = "emailId can't be null or blank")
    private String emailId;

    @Size(min = 10,max = 10,message = "Invalid contact no")
    @Pattern(regexp = "^[0-9]*$")
    private String pri_contact_no;

    private String sec_contact_no;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date dob;
    private String address;

    @ValidPassword
    private String password;

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "UserDetailsDto{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", pri_contact_no='" + pri_contact_no + '\'' +
                ", sec_contact_no='" + sec_contact_no + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
