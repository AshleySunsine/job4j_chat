package ru.job4j.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int creatorId;
    private String themeOfRoom;
    @ManyToMany
    private List<Person> participants;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public String getThemeOfRoom() {
        return themeOfRoom;
    }

    public void setThemeOfRoom(String themeOfRoom) {
        this.themeOfRoom = themeOfRoom;
    }

    public List<Person> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Person> participants) {
        this.participants = participants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Room room = (Room) o;
        return id == room.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
