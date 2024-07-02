package day12.exersise.ClassManagement.Entity;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom extends Entity{
    private Teacher teacher;
    private List<Student> students;
    private boolean hasStarted;

    public ClassRoom(String idClass) {
        this.id = idClass;
        this.students = new ArrayList<Student>();
        this.hasStarted = false;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public boolean isHasStarted() {
        return hasStarted;
    }

    public void setHasStarted(boolean hasStarted) {
        this.hasStarted = hasStarted;
    }
}
