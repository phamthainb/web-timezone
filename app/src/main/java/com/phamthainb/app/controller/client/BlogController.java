package com.phamthainb.app.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String getPageBlog() {
        return "client/blog";
    }
}
