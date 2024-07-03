package day12.exersise.ClassManagement.Entity;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Entity{
    private String nameTeacher;
    private List<ClassRoom> classRooms;

    public Teacher (String idTeacher, String nameTeacher){
        this.id = idTeacher;
        this.nameTeacher = nameTeacher;
        this.classRooms = new ArrayList<ClassRoom>(2);
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public List<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(List<ClassRoom> classRooms) {
        this.classRooms = classRooms;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nameTeacher='" + nameTeacher + '\'' +
                ", classRooms=" + classRooms +
                ", id='" + id + '\'' +
                '}';
    }
}
