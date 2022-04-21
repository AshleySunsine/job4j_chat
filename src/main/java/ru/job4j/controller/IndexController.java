package ru.job4j.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping({"/index"})
    public String index(Model model) {
        System.out.println("Index");
        return "index";
    }

    @GetMapping({"/registry"})
    public String registry(Model model) {
        System.out.println("Index");
        return "registry";
    }
}
