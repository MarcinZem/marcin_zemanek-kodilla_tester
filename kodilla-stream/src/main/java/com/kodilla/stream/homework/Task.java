package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private int localDateOpened;
    private int localDateDeadline;
    private String task;

    public Task(int localDateOpened, String task, int localDateDeadline) {
        this.localDateOpened = localDateOpened ;
        this.localDateDeadline = localDateDeadline;
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public int getlocalDateOpened() {
        return localDateOpened;
    }

    public int getlocalDateDeadline() {
        return localDateDeadline;
    }
    LocalDate myDate = LocalDate.of(2021, 8, 15);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return localDateOpened == task.localDateOpened && localDateDeadline == task.localDateDeadline && Objects.equals(task, task.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, localDateOpened, localDateDeadline);
    }
}
