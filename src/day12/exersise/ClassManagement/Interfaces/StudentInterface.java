package day12.exersise.ClassManagement.Interfaces;

import day12.exersise.ClassManagement.Entity.Student;

import java.util.HashMap;
import java.util.Map;

public interface StudentInterface extends EntityInterface<Student> {

    void dropOut(String idStudent, String reason);

}
