package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<stamp> stamps = new HashSet<>();
        stamps.add(new stamp(10.20, "lajkonik", "tak"));
        stamps.add(new stamp(10.20, "smok wawelski", "nie"));
        stamps.add(new stamp(10.20, "barbakan", "nie"));
        stamps.add(new stamp(10.20, "lajkonik", "tak"));

        System.out.println(stamps.size());
        for (stamp stamp : stamps)
            System.out.println(stamp);
    }

}
