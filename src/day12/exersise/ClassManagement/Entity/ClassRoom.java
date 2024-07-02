package day12.exersise.ClassManagement.Entity;


import java.util.HashSet;

import java.util.Set;

public class ClassRoom {
    String idClass;
    String nameClass;
    Set<Integer> listIdStudent = new HashSet<>();

    public ClassRoom (){}

    public ClassRoom(String idClass, String nameClass) {
        this.idClass = idClass;
        this.nameClass = nameClass;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Set<Integer> getListIdStudent() {
        return listIdStudent;
    }

    public void setListIdStudent(Set<Integer> listIdStudent) {
        this.listIdStudent = listIdStudent;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "idClass=" + idClass +
                ", nameClass='" + nameClass + '\'' +
                ", listIdStudent=" + listIdStudent +
                '}';
    }
}
