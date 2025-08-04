package com.Stock_Overflow.Sneaky_Business.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;
    private double targetAmount;
    private double collectedAmount;
    private LocalDate deadline;
    private boolean approved = false;

    @ManyToOne
    private BusinessOwner owner;

    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL)
    private List<Investment> investments = new ArrayList<>();

    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL)
    private List<DocumentUpload> documents = new ArrayList<>();

    // Getters and Setters
}
