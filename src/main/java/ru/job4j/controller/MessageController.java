package ru.job4j.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.job4j.domain.Message;
import ru.job4j.domain.Person;
import ru.job4j.repository.MessageStore;
import ru.job4j.repository.UserStore;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class MessageController {
    @Autowired
    MessageStore messages;
    @Autowired
    private UserStore users;


    @GetMapping("/messages/{roomId}")
    public List<Message> getAll(@PathVariable("roomId") int roomId) {
        System.out.println("Messages!" + "id= " + roomId);
        return messages.findAllByRoomId(roomId);
    }

    @PostMapping("/messages/{roomId}")
    public void putMessage(@RequestBody Message message) {
        Person personInBase = users.findByLogin(message.getSender().getLogin()).get();
        message.setSender(personInBase);
        message.setTimestamp(new Timestamp(System.currentTimeMillis()));
        messages.save(message);
    }

}