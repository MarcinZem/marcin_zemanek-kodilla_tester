package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private LocalDate localDateOpened;
    private LocalDate localDateDeadline;
    private String task;

    public Task(LocalDate localDateOpened, String task, LocalDate localDateDeadline) {
        this.localDateOpened = localDateOpened ;
        this.localDateDeadline = localDateDeadline;
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public LocalDate getlocalDateOpened() {
        return localDateOpened;
    }

    public LocalDate getlocalDateDeadline() {
        return localDateDeadline;
    }

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
