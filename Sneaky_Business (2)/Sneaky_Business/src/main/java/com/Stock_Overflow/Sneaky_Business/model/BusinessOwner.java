package com.Stock_Overflow.Sneaky_Business.model;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class BusinessOwner extends User {
    private String name;
    private String phone;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Business> businesses;

    public BusinessOwner(int id, String mail, String password) {
        super(id, mail, password);
    }

    @Override
    public void setRole(Role role) {
        super.setRole(role);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }
}
