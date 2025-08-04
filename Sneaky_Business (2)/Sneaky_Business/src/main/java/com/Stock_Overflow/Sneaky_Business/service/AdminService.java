package com.Stock_Overflow.Sneaky_Business.service;



//import com.Stock_Overflow.Sneaky_Business.entity.*;
import com.Stock_Overflow.Sneaky_Business.model.Business;

import java.util.List;


public interface AdminService {
    List<Business> getPendingBusinesses();
    void approveBusiness(Long businessId);
}
