package com.crm.cico.controllers;

import com.crm.cico.services.ShopProviderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping({"services"})
public class ServiceProviderController {

    private final ShopProviderService shopProviderService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("services", shopProviderService.findAll());
        return "services/index";
    }
}