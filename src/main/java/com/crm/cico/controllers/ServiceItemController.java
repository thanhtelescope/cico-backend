package com.crm.cico.controllers;

import com.crm.cico.services.ServiceCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping({"services"})
public class ServiceItemController {

    private final ServiceCategoryService categoryService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return "services/index";
    }
}