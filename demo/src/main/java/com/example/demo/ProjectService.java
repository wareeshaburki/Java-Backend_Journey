package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    public List<Project> getAllProjects(){
        return List.of(
                new Project(1, "ATM System", "Java based ATM"),
                new Project(2, "Portfolio", "React and Tailwind"),
                new Project(3, "E-Commerce", "Spring Boot Backend")
        );
    }

    public ArrayList<Project> projectsList = new ArrayList<>();

    public List<Project> getProjects(){
        return projectsList;
    }
}
