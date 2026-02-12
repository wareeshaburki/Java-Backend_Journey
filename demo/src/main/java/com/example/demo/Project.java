package com.example.demo;

public class Project {
    private int id;
    private String title,description;

    public Project(int id, String title, String description){
        this.description = description;
        this.id = id;
        this.title = title;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
}
