package day12.exersise.ClassManagement.Service;

import day12.exersise.ClassManagement.Entity.ClassRoom;
import day12.exersise.ClassManagement.Interfaces.ClassRoomInterface;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomService implements ClassRoomInterface<ClassRoom> {
    ArrayList<ClassRoom> classRooms = new ArrayList<>();

    //Luu dah sach student


    @Override
    public void insert(ClassRoom classRoom) {
        classRooms.add(classRoom);
    }

    @Override
    public List<ClassRoom> findAll() {
        return classRooms;
    }

    @Override
    public void showAll() {
        for (ClassRoom classRoom : classRooms) {
            System.out.println(classRoom);
        }
    }

    @Override
    public void enroll(ClassRoom ClassRoom) {

    }


}
