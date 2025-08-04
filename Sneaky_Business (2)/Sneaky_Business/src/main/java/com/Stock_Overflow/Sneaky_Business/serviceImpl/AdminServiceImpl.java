package com.Stock_Overflow.Sneaky_Business.serviceImpl;

import com.Stock_Overflow.Sneaky_Business.model.Business;
import com.Stock_Overflow.Sneaky_Business.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class AdminServiceImpl implements AdminService {
    @Override
    public List<Business> getPendingBusinesses() {
        return List.of();
    }

    @Override
    public void approveBusiness(Long businessId) {

    }
}
