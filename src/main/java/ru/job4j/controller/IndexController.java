package ru.job4j.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping({"/index"})
    public String index(Model model) {
        System.out.println("Index");
        return "index.html";
    }

    @GetMapping({"/registry"})
    public String registry(Model model) {
        System.out.println("Registry");
        return "registry";
    }
}
