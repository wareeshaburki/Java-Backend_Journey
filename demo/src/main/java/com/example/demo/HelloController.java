package com.example.demo;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hey Wareesha! Your first Spring Boot API is working.";
    }
    @GetMapping("/info")
    public String info(){
        return "I am Wareesha Burki from Lahore. I am a backend Focused Dev";
    }

    @GetMapping("/user-data")
    public User getUser(){
        return new User("Wareesha Burki","Lahore","Backend Developer");
    }

    @GetMapping("/project")
    public Project getProject(){
        return new Project(01,"ATM","deposits and withdraws money");
    }

    @Autowired
    private ProjectService projectService;

    @GetMapping("/health")
    public List<Project> getProjects(){
        return projectService.getAllProjects();
    }

    @PostMapping("/add-project")
    public String addProject(@RequestBody Project newProject){
        System.out.println("Project Received: " + newProject.getTitle());
        return "Success! Project " + newProject.getTitle() + " has been received";
    }

    @PostMapping("/add-project-to-list")
    public String addProjectToList(@Valid @RequestBody Project newProject){
        projectService.addProject(newProject);
        System.out.println("Project Received: " + newProject.getTitle());
        return "Success! Project " + newProject.getTitle() + " has been received and added to list";
    }

    @GetMapping("/getAddedList")
    public List<Project> getProjectList(){
        return projectService.getAllProjectsFromDB();
    }

    @DeleteMapping("/delete-project/{id}")
    public String deleteProject(@PathVariable int id){
        projectService.deleteProject(id);
        return "Project with " + id + " has been deleted";
    }

    @GetMapping("/greet/{name}")
    public String greetName(@PathVariable String name){
        return "Hello " + name + "!Welcome to the backend.";
    }

    @GetMapping("/get-project-by-id/{id}")
    public Project getProjectById(@PathVariable int id){
        return projectService.getProjectById(id);
    }
}
