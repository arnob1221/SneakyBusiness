package com.Stock_Overflow.Sneaky_Business.service;

//import com.Stock_Overflow.Sneaky_Business.entity.*;

import org.springframework.stereotype.Service;

import com.Stock_Overflow.Sneaky_Business.model.Business;

import java.util.List;

public interface BusinessService {
    void submitBusiness(Business business);
    List<Business> getApprovedBusinesses();
}