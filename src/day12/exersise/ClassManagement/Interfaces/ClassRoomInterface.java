package day12.exersise.ClassManagement.Interfaces;

import java.util.List;

public interface ClassRoomInterface<C> {
    void insert(C ClassRoom);
    List<C> findAll();
    void showAll();
    void enroll(C ClassRoom);
}
