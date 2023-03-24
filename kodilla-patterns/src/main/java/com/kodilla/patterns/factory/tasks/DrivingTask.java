package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean isExecuted;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName);
        System.out.println("- " + where + " using a " + using);
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