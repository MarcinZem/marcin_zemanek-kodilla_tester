package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Michał Bajor", new Teacher("Michał Nowak")));
        list.add(new Student("Jan kowalski", new Teacher("Piotr iksiński")));
        list.add(new Student("Sebastian Nowak", null));
        for (Student student : list) {
            Teacher teacher = Optional.ofNullable(student.getTeacher()).orElse(new Teacher("<undefined>"));

            System.out.println(student.name + " " + teacher.getName());
        }
    }
}
