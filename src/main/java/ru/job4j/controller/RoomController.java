package ru.job4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.job4j.domain.Room;
import ru.job4j.repository.RoomStore;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    RoomStore rooms;

    @GetMapping("/all")
    public List<Room> getAll() {
        System.out.println("Rooms!");
        return (List<Room>) rooms.findAll();
    }

    @GetMapping("/{id}")
    public Room getById(@PathVariable("id")int id) {
        System.out.println("Room!" + " id=" + id);
        return rooms.findById(id).get();
    }


}