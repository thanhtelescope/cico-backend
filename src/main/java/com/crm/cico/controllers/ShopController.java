package com.crm.cico.controllers;

import com.crm.cico.services.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping({"shops"})
public class ShopController {

    private final ShopService shopService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("shops", shopService.findAll());
        return "shops/index";
    }
}