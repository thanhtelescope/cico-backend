package com.crm.cico.controllers;

import com.crm.cico.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping({"customers"})
public class CustomerController {

    private final CustomerService customerService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customers/index";
    }
}