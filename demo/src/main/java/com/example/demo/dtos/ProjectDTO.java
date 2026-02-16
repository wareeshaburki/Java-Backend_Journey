package com.example.demo.dtos;

public class ProjectDTO {
    private String title;
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
