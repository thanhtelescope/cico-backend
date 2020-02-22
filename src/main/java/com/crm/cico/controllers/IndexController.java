package com.crm.cico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("totalShopOwners", 1000);
        model.addAttribute("totalShops", 2000);
        return "index";
    }
}
