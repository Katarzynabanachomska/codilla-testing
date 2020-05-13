package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean taskExecuted;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public String executeTask(){
        System.out.println("Executing Shopping Task.");
        taskExecuted = true;
        return "Buying " + quantity + " " + whatToBuy + ".";
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}