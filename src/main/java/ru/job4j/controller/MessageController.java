package ru.job4j.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.job4j.domain.Message;
import ru.job4j.repository.MessageStore;

import java.util.List;

@RestController
public class MessageController {
    @Autowired
    MessageStore messages;

    @RequestMapping("/messages/{roomId}")
    public List<Message> getAll(@PathVariable("roomId") int roomId) {
        System.out.println("Messages!" + "id= " + roomId);
        return messages.findAllByRoomId(roomId);
    }
}