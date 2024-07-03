package day12.exersise.ClassManagement.Service;

import day12.exersise.ClassManagement.Entity.ClassRoom;
import day12.exersise.ClassManagement.Entity.Student;
import day12.exersise.ClassManagement.Interfaces.ClassRoomInterface;

import java.time.LocalDate;

public class ClassRoomService extends EntityService<ClassRoom> implements ClassRoomInterface {
    @Override
    public void addStudentToClass(String idClassRoom, Student student){
        ClassRoom classRoom = getById(idClassRoom);
        if (idClassRoom != null ){
            classRoom.getStudents().add(student);
            System.out.println("addStudentToClass");
        }
    }

    @Override
    public void startClass(String idClass) {
        ClassRoom classRoom = getById(idClass);
        if (classRoom != null ){
            classRoom.setHasStarted(true);
            for (Student student : classRoom.getStudents()) {
                student.setEnrollDay(LocalDate.now());
            }
        }
    }
}
