package com.crm.cico.controllers;

import com.crm.cico.services.ServiceItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping({"services"})
public class ServiceItemController {

    private final ServiceItemService serviceItemService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("services", serviceItemService.findAll());
        return "services/index";
    }
}