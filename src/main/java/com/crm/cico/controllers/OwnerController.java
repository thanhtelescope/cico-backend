package com.crm.cico.controllers;

import com.crm.cico.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping({"owners"})
public class OwnerController {

    private final OwnerService ownerService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}