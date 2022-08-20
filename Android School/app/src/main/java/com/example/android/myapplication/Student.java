package com.example.android.myapplication;

public class Student {
    private String studentName;
    private  int studentage;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public int getStudentphoto() {
        return studentphoto;
    }

    public void setStudentphoto(int studentphoto) {
        this.studentphoto = studentphoto;
    }

    private int studentphoto;

    public Student(String studentName, int studentage, int studentphoto) {
        this.studentName = studentName;
        this.studentage = studentage;
        this.studentphoto = studentphoto;
    }
}

