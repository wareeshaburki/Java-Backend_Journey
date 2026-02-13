package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    public List<Project> getAllProjectsFromDB() {
        return projectRepository.findAll(); 
    }
    public void addProject(Project project) {
        projectRepository.save(project);
    }
    public void deleteProject(int id){
        projectRepository.deleteById(id);
    }
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
