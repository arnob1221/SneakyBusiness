package com.Stock_Overflow.Sneaky_Business.controller;

import com.Stock_Overflow.Sneaky_Business.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

import com.Stock_Overflow.Sneaky_Business.*;
import com.Stock_Overflow.Sneaky_Business.service.*;

import java.util.List;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private User user;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        Model user1;
        //user1 = model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        this.user = user;
        return "redirect:/auth/login";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}