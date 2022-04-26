package ru.job4j.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.job4j.domain.Room;

import java.util.List;

public interface RoomStore extends CrudRepository<Room, Integer> {

}
