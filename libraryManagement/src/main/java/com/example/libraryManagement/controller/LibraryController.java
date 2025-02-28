package com.example.libraryManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryController {

    // Index sayfasını döndürecek
    @GetMapping("/")
    public String index() {
        return "index";  // resources/templates/index.html
    }
}
