package com.Stock_Overflow.Sneaky_Business.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private LocalDate date;
    private double estimatedROI;

    @ManyToOne
    private Investor investor;

    @ManyToOne
    private Business business;

    public void setId(Long id) {
        this.id = id;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setEstimatedROI(double estimatedROI) {
        this.estimatedROI = estimatedROI;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    public Business getBusiness() {
        return business;
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public double getEstimatedROI() {
        return estimatedROI;
    }

    public Investor getInvestor() {
        return investor;
    }

    public LocalDate getDate() {
        return date;
    }
}
