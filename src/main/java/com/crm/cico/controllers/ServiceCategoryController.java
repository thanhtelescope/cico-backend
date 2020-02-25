package com.crm.cico.controllers;

import com.crm.cico.services.ServiceCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping({"service-categories"})
public class ServiceCategoryController {

    private final ServiceCategoryService serviceCategoryService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("categories", serviceCategoryService.findAll());
        return "service_categories/index";
    }
}