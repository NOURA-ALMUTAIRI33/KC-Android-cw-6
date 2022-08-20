package com.example.myapplicationcw6;

public class Student {

    private String studentName;
    private int studentAge;
    private int studentphoto;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentphoto() {
        return studentphoto;
    }

    public void setStudentphoto(int studentphoto) {
        this.studentphoto = studentphoto;
    }

    public Student(String studentName, int studentAge, int studentphoto) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentphoto = studentphoto;
    }
}
