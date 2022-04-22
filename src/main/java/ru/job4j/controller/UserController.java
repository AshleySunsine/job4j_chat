package ru.job4j.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import ru.job4j.domain.Person;
import ru.job4j.repository.UserStore;

import java.util.List;

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
    public void signUp(@RequestBody Person person) {
        System.out.println("HUI!");
        person.setPassword(encoder.encode(person.getPassword()));
        System.out.println(users.save(person));
        System.out.println("Registry!");

    }

    @PostMapping("/sign-in")
    public Person signIn(@RequestBody Person person) {
        Person personInBase = users.findByLogin(person.getLogin()).get();
        System.out.println(personInBase.getPassword() + " base");
        System.out.println(encoder.encode(person.getPassword()) + " front");
        if ((personInBase != null) && (personInBase.getPassword().equals(encoder.encode(person.getPassword())))) {
            System.out.println(person.getLogin() + " AUTORIZED!");
            return personInBase;
        }
        System.out.println("Don`t authorized!");
        return null;
    }

    @GetMapping("/all")
    public List<Person> findAll() {
        return (List<Person>) users.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") int id) {
        return users.findById(id).get();
    }
}
