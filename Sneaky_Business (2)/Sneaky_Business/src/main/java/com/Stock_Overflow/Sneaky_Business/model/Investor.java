package com.Stock_Overflow.Sneaky_Business.model;

import jakarta.persistence.Entity;

@Entity
public class Investor extends User {

    private String name;

    private String phone;
    private final String password;


    public Investor(int id, String name, String mail, String phone, String password)
    {
        super(id, mail, password);

        this.name=name;

        this.phone=phone;

        this.password = password;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }
}
