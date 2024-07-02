package day12.exersise.ClassManagement.Interfaces;

import day12.exersise.ClassManagement.Entity.Student;
import day12.exersise.ClassManagement.Entity.Teacher;

import java.util.List;

public interface TeacherInterface extends EntityInterface<Teacher> {
    void assignTeacherToClass(String idTeacher, String idClass);
    List<Student> getStudentByTeacher(String idTeacher);
}
