package ru.job4j.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoomController {
    @GetMapping("/room")
    public ModelAndView goToRoomById(Model model) {
        System.out.println("AAA");
        ModelAndView mav = new ModelAndView("room.html");
        return mav;
    }

    @GetMapping("/addRoom")
    public ModelAndView goToCreateRoom() {
        System.out.println("ADD Room");
        ModelAndView mav = new ModelAndView("createRoom.html");
        return mav;
    }
}
