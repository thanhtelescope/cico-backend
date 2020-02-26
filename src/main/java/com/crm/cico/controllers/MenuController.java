package com.crm.cico.controllers;

import com.crm.cico.services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping({"menus"})
public class MenuController {

    private final MenuService menuService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("menus", menuService.findAll());
        return "menus/index";
    }
}