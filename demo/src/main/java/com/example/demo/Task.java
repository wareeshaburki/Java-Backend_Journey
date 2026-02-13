package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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
