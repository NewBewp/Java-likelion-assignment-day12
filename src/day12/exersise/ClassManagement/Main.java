package day12.exersise.ClassManagement;

import day12.exersise.ClassManagement.Entity.ClassRoom;
import day12.exersise.ClassManagement.Entity.Student;
import day12.exersise.ClassManagement.Service.ClassRoomService;
import day12.exersise.ClassManagement.Service.StudentService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        ClassRoomService classRoomService = new ClassRoomService();

        Student st = new Student();
        st.setIdStudent("0");
        st.setNameStudent("Jack");
        st.setCccd("01");
        st.setStatus("NotStarted ");

        Student st2 = new Student();
        st2.setIdStudent("1");
        st2.setNameStudent("Alice");
        st2.setCccd("02");
        st2.setStatus("Enrolled");

        Student st3 = new Student();
        st3.setIdStudent("2");
        st3.setNameStudent("Mainoo");
        st3.setCccd("03");
        st3.setStatus("Enrolled");

        studentService.insert(st);
        studentService.insert(st2);
        studentService.insert(st3);

        ClassRoom classRoom = new ClassRoom();
        classRoom.setIdClass("0");
        classRoom.setNameClass("Lop1");

        ClassRoom classRoom2 = new ClassRoom();
        classRoom2.setIdClass("1");
        classRoom2.setNameClass("Lop2");
        classRoomService.insert(classRoom);
        classRoomService.insert(classRoom2);

        studentService.showAll();
        classRoomService.showAll();
    }
}
