package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> taskAdd(String newTask) {
        tasks.add(newTask);
        return tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "The task is: " + tasks;
    }
}
