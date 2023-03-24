package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isExecuted;


    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName);
        System.out.println("- " + whatToBuy + " " + quantity);
        isExecuted = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isExecuted) {
            System.out.println("Task executed.\n");
            return true;
        } else {
            System.out.println("Task not executed.\n");
            return false;
        }
    }
}