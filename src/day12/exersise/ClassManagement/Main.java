package day12.exersise.ClassManagement;

import day12.exersise.ClassManagement.Entity.ClassRoom;
import day12.exersise.ClassManagement.Entity.Student;
import day12.exersise.ClassManagement.Interfaces.ClassRoomInterface;
import day12.exersise.ClassManagement.Interfaces.StudentInterface;
import day12.exersise.ClassManagement.Service.ClassRoomService;
import day12.exersise.ClassManagement.Service.EntityService;
import day12.exersise.ClassManagement.Service.StudentService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        ClassRoomService classRoomService = new ClassRoomService();

        Student student = new Student("Alice", LocalDate.of(2004, 1, 15), "HCM11", LocalDate.of(2023, 9, 1));
        Student student1 = new Student("John", LocalDate.of(2003, 5, 23), "HCM12", LocalDate.of(2023, 9, 1));
        Student student2 = new Student("Mike", LocalDate.of(2004, 3, 10), "HCM13", LocalDate.of(2023, 9, 1));
        Student student3 = new Student("Luke", LocalDate.of(2003, 12, 2), "HCM14", LocalDate.of(2023, 9, 1));
        Student student4 = new Student("Chandler", LocalDate.of(2004, 7, 19), "HCM15", LocalDate.of(2023, 9, 1));
        Student student5 = new Student("Minoo", LocalDate.of(2003, 8, 11), "HCM16", LocalDate.of(2023, 9, 1));
        Student student6 = new Student("Ronaldo", LocalDate.of(2004, 6, 29), "HCM17", LocalDate.of(2023, 9, 1));

        ClassRoom classRoom = new ClassRoom("C1");
        ClassRoom classRoom1 = new ClassRoom("C2");
        ClassRoom classRoom2 = new ClassRoom("C3");

        classRoomService.add(classRoom);
        classRoomService.add(classRoom1);
        classRoomService.add(classRoom2);

        studentService.add(student);
        studentService.add(student1);
        studentService.add(student2);
        studentService.add(student3);
        studentService.add(student4);
        studentService.add(student5);
        studentService.add(student6);

        studentService.getAll();
        System.out.println("////////");

        studentService.update("S1",new Student("AAAAAA", LocalDate.of(2004, 1, 15), "HCM11", LocalDate.of(2023, 9, 1)));

        studentService.getAll();

        studentService.dropOut("S2","Broke");

        classRoomService.addStudentToClass("C1", student3);
        classRoomService.startClass("C1");

    }
}
