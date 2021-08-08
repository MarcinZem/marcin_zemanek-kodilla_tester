package com.kodilla.collections.adv.immutable;

import com.kodilla.collections.adv.immutable.homework.Task;

public class ImmutableExample {
    public static void main(String[] args) {
        Task task = new TaskHacked("John Stewart", 3);
        TaskHacked taskHacked = (TaskHacked) task;
        taskHacked.modifyTitle("New title");
        System.out.println(task.getTitle());
    }
}
