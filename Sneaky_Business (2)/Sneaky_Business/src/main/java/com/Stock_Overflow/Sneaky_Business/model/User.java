package com.Stock_Overflow.Sneaky_Business.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    protected String mail;
    protected String password;
    protected Role role;

    public User(int id, String mail, String password)
    {
        this.id=id;
        this.mail=mail;
        this.password=password;

    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
