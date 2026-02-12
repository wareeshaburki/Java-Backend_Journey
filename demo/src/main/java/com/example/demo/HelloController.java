package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//Ye line Spring Boot ki library se GetMapping ka tool utha kar la rahi hai,
// takay aap bata sakein ke kis URL par kya kaam hona hai.
//Ye line RestController ka tool la rahi hai,
// jo aapki normal Java class ko ek "Web Server" ki class mein badal deti hai.
import java.util.List;

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
    public String addProjectToList(@RequestBody Project newProject){
        projectService.projectsList.add(newProject);
        System.out.println("Project Received: " + newProject.getTitle());
        return "Success! Project " + newProject.getTitle() + " has been received and added to list";
    }

    @GetMapping("/getAddedList")
    public List<Project> getProjectList(){
        return projectService.getProjects();
    }

    @DeleteMapping("/delete-project/{id}")
    public String deleteProject(@PathVariable int id){
        return "Project with " + id + " has been deleted";
    }

    @GetMapping("/greet/{name}")
    public String greetName(@PathVariable String name){
        return "Hello " + name + "!Welcome to the backend.";
    }
}
