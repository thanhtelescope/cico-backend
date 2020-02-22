package com.crm.cico.controllers;

import com.crm.cico.services.OwnerService;
import com.crm.cico.services.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class IndexController {

    private ShopService shopService;
    private OwnerService ownerService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("totalShopOwners", ownerService.count());
        model.addAttribute("totalShops", shopService.count());
        return "index";
    }
}
