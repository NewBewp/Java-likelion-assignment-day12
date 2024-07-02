package day12.exersise.ClassManagement.Entity;

import java.util.Date;

public class Student {
    private String idStudent;
    private String nameStudent;
    private Date DoBStudent;
    private String cccd;
    private String status;

    public Student() {}

    public Student(String idStudent, String nameStudent,Date DobStudent, String cccd, String status) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.DoBStudent = DobStudent;
        this.cccd = cccd;
        this.status = status;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Date getDoBStudent() {
        return DoBStudent;
    }

    public void setDoBStudent(Date doBStudent) {
        DoBStudent = doBStudent;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", cccd='" + cccd + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
