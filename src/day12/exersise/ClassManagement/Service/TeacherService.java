package day12.exersise.ClassManagement.Service;

import day12.exersise.ClassManagement.Entity.ClassRoom;
import day12.exersise.ClassManagement.Entity.Student;
import day12.exersise.ClassManagement.Entity.Teacher;
import day12.exersise.ClassManagement.Interfaces.ClassRoomInterface;
import day12.exersise.ClassManagement.Interfaces.EntityInterface;
import day12.exersise.ClassManagement.Interfaces.TeacherInterface;

import java.util.ArrayList;
import java.util.List;

public class TeacherService extends EntityService<Teacher> implements TeacherInterface {
    @Override
    public void assignTeacherToClass(String idTeacher, ClassRoom classRoom) {
        //Khai báo đối tượng Teacher theo id
        Teacher teacher = getById(idTeacher);
        if (teacher != null) {
           teacher.getClassRooms().add(classRoom);
        }

    }

    @Override
    public List<Student> getStudentByTeacher(String idTeacher) {
        Teacher teacher = getById(idTeacher);
        List<Student> students = new ArrayList<>();
        if (teacher != null) {
            for(ClassRoom classRoom : teacher.getClassRooms()){
                students.addAll(classRoom.getStudents());
            }
        }
        return students;
    }
}
