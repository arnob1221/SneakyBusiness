package com.Stock_Overflow.Sneaky_Business.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

//import com.Stock_Overflow.Sneaky_Business.entity.*;
import com.Stock_Overflow.Sneaky_Business.service.*;

import java.util.List;

@Controller
@RequestMapping("/investor")
public class InvestorController {

    @Autowired
    private InvestorService investorService;

    private Long businessId;
    private double amount;

    @GetMapping("/dashboard")
    public String getInvestorDashboard(Model model) {
        return "investor-dashboard";
    }

    @PostMapping("/invest")
    public String invest(@RequestParam Long businessId, @RequestParam double amount) {
        this.businessId = businessId;
        this.amount = amount;
        investorService.investInBusiness(businessId, amount);
        return "redirect:/investor/dashboard";
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}