package ru.job4j.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import ru.job4j.domain.Person;
import ru.job4j.repository.UserStore;

import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserStore users;
    private BCryptPasswordEncoder encoder;

    public UserController(UserStore users, BCryptPasswordEncoder encoder) {
        this.users = users;
        this.encoder = encoder;
    }

    @PostMapping("/sign-up")
    public Person signUp(@RequestBody Person person) {
        System.out.println("HUI!");
        person.setPassword(encoder.encode(person.getPassword()));
        System.out.println("Registry!");
        return users.save(person);

    }

    @PostMapping("/sign-in")
    public Person signIn(@RequestBody Person person) {
        Person personInBase = users.findByLogin(person.getLogin()).get();
        if ((personInBase != null) && (personInBase.getPassword().equals(encoder.encode(person.getPassword())))) {
            System.out.println(person.getLogin() + " AUTORIZED!");
            return personInBase;
        }
        System.out.println("Don`t authorized!");
        return null;
    }

    @GetMapping("/all")
    public Set<Person> findAll() {
        System.out.println("ALL USERS");
        return (Set<Person>) users.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") int id) {
        return users.findById(id).get();
    }
}
