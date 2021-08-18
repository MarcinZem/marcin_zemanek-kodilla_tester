package com.kodilla.optional.homework;

public class Student {

    String name;
    Teacher teacher;

    public Student(String student, Teacher teacher) {
        this.name = student;
        this.teacher = teacher;
    }

    public Student(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
