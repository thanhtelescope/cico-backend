package com.crm.cico.controllers;

import com.crm.cico.model.Menu;
import com.crm.cico.services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

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

    @GetMapping("/{menuId}")
    public String showOwner(@PathVariable Long menuId, Model model) {
        Optional<Menu> menu = menuService.findById(menuId);
        if (!menu.isPresent()) {
            throw new RuntimeException("Menu not exists");
        }
        model.addAttribute("menu", menu.get());
        return "menus/menuDetails";
    }
}