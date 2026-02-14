package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Task name cannot be empty!")
    @Size(min = 5,message = "Task name must contain minimum 5 characters")
    private String taskName;
    private boolean isCompleted;

    public Task(){}

    public int getId(){
        return id;
    }

    public String getTaskName(){
        return taskName;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    public void setCompleted(boolean isCompleted){
        this.isCompleted = isCompleted;
    }
}
