package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{

    final String taskName;
    final String where;
    final String using;
    boolean taskExecuted;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public String executeTask(){
        System.out.println("Executing Driving Task.");
        taskExecuted = true;
        return "Driving a " + using  + " to the " + where + ".";
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}