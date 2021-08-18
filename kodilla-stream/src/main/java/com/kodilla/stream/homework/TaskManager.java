package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> localDates = TaskRepository.getTasksList()
            .stream()
            .map(v -> v.getlocalDateDeadline())
                .filter(v -> v.isAfter(LocalDate.now()))
            .collect(Collectors.toList());
        System.out.println(localDates);
    }
    public static String getTask(Task task) {
        return task.getTask();
    }
}
