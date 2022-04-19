package ru.job4j.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.job4j.domain.Person;

import java.util.Optional;

public interface UserStore extends CrudRepository<Person, Integer> {
    @Query("from Person prs where prs.login = :login")
    Optional<Person> findByLogin(String login);
}
