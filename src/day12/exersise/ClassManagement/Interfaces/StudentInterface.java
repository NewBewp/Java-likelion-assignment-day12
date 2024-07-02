package day12.exersise.ClassManagement.Interfaces;

import day12.exersise.ClassManagement.Entity.Student;

public interface StudentInterface extends EntityInterface<Student> {
    void dropOutList(String idStudent, String reason);
}
