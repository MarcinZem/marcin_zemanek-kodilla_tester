package com.kodilla.optional.homework;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Michał Bajor", "Michał Nowak"));
        list.add(new Student("Jan kowalski", "Piotr iksiński"));
        list.add(new Student("Sebastian Nowak", null));
        System.out.println();
    }
}
