package ru.job4j.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.job4j.domain.Message;

import java.util.ArrayList;
import java.util.List;

public interface MessageStore extends CrudRepository<Message, Long> {
    @Query("from Message ms where ms.roomId=:roomId")
    List<Message> findAllByRoomId(int roomId);
}
