package day12.exersise.ClassManagement;

import day12.exersise.ClassManagement.Entity.ClassRoom;
import day12.exersise.ClassManagement.Entity.Student;
import day12.exersise.ClassManagement.Entity.Teacher;
import day12.exersise.ClassManagement.Service.ClassRoomService;
import day12.exersise.ClassManagement.Service.StudentService;
import day12.exersise.ClassManagement.Service.TeacherService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        ClassRoomService classRoomService = new ClassRoomService();

        // Khởi tạo đối tượng Student
        Student student = new Student("Alice", LocalDate.of(2004, 1, 15), "HCM11", LocalDate.of(2023, 9, 1));
        Student student1 = new Student("John", LocalDate.of(2003, 5, 23), "HCM12", LocalDate.of(2023, 9, 1));
        Student student2 = new Student("Mike", LocalDate.of(2004, 3, 10), "HCM13", LocalDate.of(2023, 9, 1));
        Student student3 = new Student("Luke", LocalDate.of(2003, 12, 2), "HCM14", LocalDate.of(2023, 9, 1));
        Student student4 = new Student("Chandler", LocalDate.of(2004, 7, 19), "HCM15", LocalDate.of(2023, 9, 1));
        Student student5 = new Student("Minoo", LocalDate.of(2003, 8, 11), "HCM16", LocalDate.of(2023, 9, 1));
        Student student6 = new Student("Ronaldo", LocalDate.of(2004, 6, 29), "HCM17", LocalDate.of(2023, 9, 1));

        // Khởi tạo đối tượng ClassRoom
        ClassRoom classRoom = new ClassRoom("C1");
        ClassRoom classRoom1 = new ClassRoom("C2");
        ClassRoom classRoom2 = new ClassRoom("C3");

        // Thêm ClassRoom vào service
        classRoomService.add(classRoom);
        classRoomService.add(classRoom1);
        classRoomService.add(classRoom2);

        // Thêm Student vào service
        studentService.add(student);
        studentService.add(student1);
        studentService.add(student2);
        studentService.add(student3);
        studentService.add(student4);
        studentService.add(student5);
        studentService.add(student6);

        // Student khi chưa update
        studentService.getAll();
        studentService.update("S1", new Student("AAAAAA", LocalDate.of(2004, 1, 15), "HCM11", LocalDate.of(2023, 9, 1)));
        // Student sau khi update
        studentService.getAll();

        studentService.dropOut("S2", "School Transfer");

        // Tạo đối tượng cho Teacher
        Teacher teacher = new Teacher("T1", "Mr.Messi");
        Teacher teacher1 = new Teacher("T2", "Mr.Ted");
        teacherService.add(teacher);
        teacherService.add(teacher1);

        // ClassRoom khi chưa có Student và chưa bắt đầu
        classRoomService.getAll();

        // Bắt đầu lớp học C1
        classRoomService.startClass("C1");

        // Thêm Student vào ClassRoom C1
        classRoomService.addStudentToClass("C1", student3);

        // Đưa Teacher cho lớp
        teacherService.assignTeacherToClass("T1", classRoom);
        teacherService.assignTeacherToClass("T2", classRoom1);

        teacherService.getAll();

        // ClassRoom khi đã thêm Student và đã bắt đầu
        classRoomService.getAll();

        //Tim danh sach hoc sinh theo id teacher
        List<Student> studentListByTeacherId = teacherService.getStudentByTeacher("T1");
        for (Student s : studentListByTeacherId) {
            System.out.println("Student ID: " + s.getId() + "Student Name" + s.getNameStudent());
        }
    }
}

