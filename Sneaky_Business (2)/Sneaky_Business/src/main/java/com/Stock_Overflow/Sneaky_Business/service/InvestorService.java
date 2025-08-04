package com.Stock_Overflow.Sneaky_Business.service;
//import com.Stock_Overflow.Sneaky_Business.entity.*;
import com.Stock_Overflow.Sneaky_Business.model.Business;

import java.util.List;
public interface InvestorService {
    void investInBusiness(Long businessId, double amount);
}
