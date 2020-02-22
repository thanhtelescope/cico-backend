package com.crm.cico.controllers;

import com.crm.cico.services.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping({"staffs"})
public class StaffController {

    private final StaffService staffService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("staffs", staffService.findAll());
        return "staffs/index";
    }
}