package com.example.usermanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "mt_user")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    @NotNull(message = "Name could not empty")
    private String name;
    @Column(name = "Gender")
    @NotNull(message = "Gender could not empty")
    private String gender ;

    @Column(name = "Birth")
    @NotNull(message = "Birth could not empty")
    private Date dob;

    @Column(name = "Phone")
    @NotNull(message = "Phone could not empty")
    private int phoneNumber;
    @Column(name = "Email")
    @NotNull(message = "Email could not empty")
    private String email;
    @Column(name = "Address")
    private String address;


    public User() {
    }

    public User(int id, String name, String gender, Date dob, int phoneNumber, String email, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
