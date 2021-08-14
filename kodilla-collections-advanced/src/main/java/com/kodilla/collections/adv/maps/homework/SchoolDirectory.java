package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> classRoom = new HashMap<>();
        Principal oxford = new Principal("mr. Patten, Oxford");
        Principal harvard = new Principal("mr. Bacow, Harvard");
        Principal stanford = new Principal("mr. Hennessy, Stanford");

        School oxfordSchool = new School(21500);
        School harvardSchool = new School(25000);
        School stanfordSchool = new School(23000);

        classRoom.put(oxford, oxfordSchool);
        classRoom.put(harvard, harvardSchool);
        classRoom.put(stanford, stanfordSchool);

        System.out.println(classRoom.get(oxford));

        for (Map.Entry<Principal, School> SchoolEntry : classRoom.entrySet())
            System.out.println(SchoolEntry.getKey().getFirstname());
        for (Map.Entry<Principal, School> SchoolEntry : classRoom.entrySet())
            System.out.println(SchoolEntry.getValue().getAverage());
    }
}
