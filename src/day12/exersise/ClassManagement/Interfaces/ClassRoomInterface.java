package day12.exersise.ClassManagement.Interfaces;

import day12.exersise.ClassManagement.Entity.ClassRoom;
import day12.exersise.ClassManagement.Entity.Student;

//Mở rộng từ interface EntityService đặt thực thể là ClassRoom
public interface ClassRoomInterface extends EntityInterface<ClassRoom> {
    //phương thức thêm
    void addStudentToClass(String idClass, Student student);
    void startClass(String idClass);
}