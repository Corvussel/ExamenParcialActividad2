/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Actividad_PA1.demo.controller;

/**
 *
 * @author LAB_P03
 */

import com.Actividad_PA1.demo.model.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String viewProducto(Model model) {

        model.addAttribute("user", new user());
        return "index";
    }

    @PostMapping("/register")
    public String successProducto(@ModelAttribute user user, Model model) {

        model.addAttribute("user", user); 
        return "success"; 
    }
}
