package com.phamthainb.app.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
    @GetMapping("/shop")
    public String getPageShop() {
        return "client/shop";
    }
}
