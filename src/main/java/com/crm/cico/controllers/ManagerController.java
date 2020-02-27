package com.crm.cico.controllers;

import com.crm.cico.model.Manager;
import com.crm.cico.services.ManagerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

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

    @GetMapping("/{managerId}")
    public String showOwner(@PathVariable Long managerId, Model model) {
        Optional<Manager> manager = managerService.findById(managerId);
        if (!manager.isPresent()) {
            throw new RuntimeException("Manager not exists");
        }
        model.addAttribute("manager", manager.get());
        return "managers/managerDetails";
    }
}