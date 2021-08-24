package com.phamthainb.app.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String getPageAbout() {
        return "client/about";
    }
}
