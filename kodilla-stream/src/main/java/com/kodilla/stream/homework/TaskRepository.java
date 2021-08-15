package com.kodilla.stream.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasksList() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(2021-8-13, "Homework", 2021-8-16));
        tasks.add(new Task(2021-7-7, "Kodilla Course", 2021-11-10));
        tasks.add(new Task(2021-8-14, "Shopping", 2021-8-17));
        return tasks;
    }
}
