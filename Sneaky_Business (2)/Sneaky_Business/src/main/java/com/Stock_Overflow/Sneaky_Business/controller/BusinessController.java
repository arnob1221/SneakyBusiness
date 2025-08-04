package com.Stock_Overflow.Sneaky_Business.controller;
import com.Stock_Overflow.Sneaky_Business.model.Business;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

//import com.Stock_Overflow.Sneaky_Business.entity.*;
import com.Stock_Overflow.Sneaky_Business.service.*;

import java.util.List;

@Controller
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    private Business business;

    @GetMapping("/list")
    public String listApprovedBusinesses(Model model) {
        List<Business> businesses = businessService.getApprovedBusinesses();
        model.addAttribute("businesses", businesses);
        return "business-list";
    }

    @PostMapping("/add")
    public String addBusiness(@ModelAttribute Business business) {
        this.business = business;
        businessService.submitBusiness(business);
        return "redirect:/owner/dashboard";
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
}
