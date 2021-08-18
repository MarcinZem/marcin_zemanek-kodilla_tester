package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasksList() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(LocalDate.of(2021,7,13), "Homework", LocalDate.of(2021,8,26)));
        tasks.add(new Task(LocalDate.of(2021,8,1), "Kodilla Course", LocalDate.of(2021,8,19)));
        tasks.add(new Task(LocalDate.of(2021,7,30), "Shopping", LocalDate.of(2021,8,20)));
        return tasks;
    }
}
