package com.crm.cico.controllers;

import com.crm.cico.services.ManagerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping({"managers"})
public class ManagerController {

    private final ManagerService managerService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("managers", managerService.findAll());
        return "managers/index";
    }
}