package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> pupils = new ArrayList<>();

    public School(double... classRooms) {
        for (double school : classRooms)
            this.pupils.add(school);
    }
    @Override
    public String toString() {
        return "School: " + pupils.toString();
    }
    public double getAverage() {
        double sum = 0.0;
        for (double school : this.pupils)
            sum = school;
        return sum / pupils.size();
    }
}

