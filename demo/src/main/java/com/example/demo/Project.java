package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells JPA to create a table named "Project"
public class Project {
    @Id // Marks this as the Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increments ID
    private int id;
    private String title;
    private String description;

    public Project(){}
    public Project(int id, String title, String description){
        this.description = description;
        this.id = id;
        this.title = title;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) { this.id = id; }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) { this.title = title; }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description) { this.description = description; }
}
