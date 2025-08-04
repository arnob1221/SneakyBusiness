package com.Stock_Overflow.Sneaky_Business.controller;
import com.Stock_Overflow.Sneaky_Business.model.Business;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

//import com.Stock_Overflow.Sneaky_Business.entity.*;
import com.Stock_Overflow.Sneaky_Business.service.*;

import java.util.List;
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    private Long businessId;

    @GetMapping("/pending")
    public String viewPendingBusinesses(Model model) {
        List<Business> pendingBusinesses = adminService.getPendingBusinesses();
        model.addAttribute("pendingBusinesses", pendingBusinesses);
        return "admin-pending";
    }

    @PostMapping("/approve")
    public String approveBusiness(@RequestParam Long businessId) {
        this.businessId = businessId;
        adminService.approveBusiness(businessId);
        return "redirect:/admin/pending";
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }
}
