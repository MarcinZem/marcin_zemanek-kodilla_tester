package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> classRoom = new HashMap<>();
        Principal oxford = new Principal("mr. Patten");
        Principal harvard = new Principal("mr. Bacow");
        Principal stanford = new Principal("mr. Hennessy");

        School oxfordSchool = new School(21500);
        School harvardSchool = new School(25000);
        School stanfordSchool = new School(23000);

        classRoom.put(oxfordSchool, oxford);
        classRoom.put(harvardSchool, harvard);
        classRoom.put(stanfordSchool, stanford);

        System.out.println(classRoom.get(oxford));

        for (Map.Entry<School, Principal> SchoolEntry : classRoom.entrySet())
            System.out.println(SchoolEntry.getKey().getAverage());
        for (Map.Entry<School, Principal> PrincipalEntry : classRoom.entrySet())
            System.out.println(PrincipalEntry);

    }
}
