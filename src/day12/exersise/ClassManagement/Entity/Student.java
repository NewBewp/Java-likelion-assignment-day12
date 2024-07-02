package day12.exersise.ClassManagement.Entity;


import java.time.LocalDate;

public class Student extends Entity{
    private static int idCounter = 1;
    private String nameStudent;
    private LocalDate birthDayStudent;
    private String cccd;
    private LocalDate enrollDay;

    public Student(String nameStudent, LocalDate birthDayStudent, String cccd, LocalDate enrollDay) {
        this.id = "S" + idCounter;
        this.nameStudent = nameStudent;
        this.birthDayStudent = birthDayStudent;
        this.cccd = cccd;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public LocalDate getBirthDayStudent() {
        return birthDayStudent;
    }

    public void setBirthDayStudent(LocalDate birthDayStudent) {
        this.birthDayStudent = birthDayStudent;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public LocalDate getEnrollDay() {
        return enrollDay;
    }

    public void setEnrollDay(LocalDate enrollDay) {
        this.enrollDay = enrollDay;
    }
}
