package com.Stock_Overflow.Sneaky_Business.serviceImpl;

import com.Stock_Overflow.Sneaky_Business.model.Business;
import com.Stock_Overflow.Sneaky_Business.service.BusinessService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BusinessServiceImpl implements BusinessService {
    @Override
    public void submitBusiness(Business business) {

    }

    @Override
    public List<Business> getApprovedBusinesses() {
        return List.of();
    }
}
