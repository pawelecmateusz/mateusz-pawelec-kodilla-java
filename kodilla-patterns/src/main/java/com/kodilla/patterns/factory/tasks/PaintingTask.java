package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToBuy;
    private boolean isExecuted;

    public PaintingTask(final String taskName, final String color, final String whatToBuy) {
        this.taskName = taskName;
        this.color = color;
        this.whatToBuy = whatToBuy;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName);
        System.out.println("- with " + color + " " + whatToBuy);
        isExecuted = true;
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
