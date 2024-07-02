package day12.exersise.ClassManagement.Service;

import day12.exersise.ClassManagement.Entity.Student;
import day12.exersise.ClassManagement.Interfaces.StudentInterface;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements StudentInterface<Student> {
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void insert(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void showAll(){
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
