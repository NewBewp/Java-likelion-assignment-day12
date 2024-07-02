package day12.exersise.ClassManagement.Service;

import day12.exersise.ClassManagement.Entity.Student;
import day12.exersise.ClassManagement.Interfaces.StudentInterface;

import java.util.HashMap;
import java.util.Map;

public class StudentService extends EntityService<Student> implements StudentInterface {
    private Map<String, String> dropoutStudentList = new HashMap<>();

    @Override
    public void dropOutList(String idStudent, String reason){
        Student student = getById(idStudent);
        if(student != null){
            dropoutStudentList.put(idStudent, reason);
        }
    }
}
