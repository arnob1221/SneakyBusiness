package com.Stock_Overflow.Sneaky_Business.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

//import com.Stock_Overflow.Sneaky_Business.entity.*;
import com.Stock_Overflow.Sneaky_Business.service.*;

import java.util.List;
@Controller
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private BusinessOwnerService ownerService;

    private Long businessId;
    private double profit;

    @GetMapping("/dashboard")
    public String getOwnerDashboard(Model model) {
        return "owner-dashboard";
    }

    @PostMapping("/update-profit")
    public String updateMonthlyProfit(@RequestParam Long businessId, @RequestParam double profit) {
        this.businessId = businessId;
        this.profit = profit;
        ownerService.updateProfit(businessId, profit);
        return "redirect:/owner/dashboard";
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}

