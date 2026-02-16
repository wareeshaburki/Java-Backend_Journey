package com.example.demo.dtos;

public class TaskDTO {
    private String taskName;
    private boolean isCompleted;

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
