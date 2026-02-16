package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.dtos.ProjectDTO;
import com.example.demo.exceptions.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

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
        Project project = projectRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id " + id + " not found!"));
        projectRepository.delete(project);
    }
    public Project getProjectById(int id){
        return projectRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Project not found with id : " + id + "!"));
    }
    public List<Project> getProjectByTitle(String title){
        return projectRepository.findByTitle(title);
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

//    public List<ProjectDTO> getAllProjectsAsDto() {
//        List<Project> projects = projectRepository.findAll();
//        List<ProjectDTO> projectDTOS = new ArrayList<>();
//        for(Project p:projects){
//            ProjectDTO projectDTO = new ProjectDTO();
//            projectDTO.setTitle(p.getTitle());
//            projectDTO.setDescription(p.getDescription());
//            projectDTOS.add(projectDTO);
//        }
//        return projectDTOS;
//    }


//    public List<ProjectDTO> getAllProjectsAsDto(){
//        return projectRepository.findAll().stream().map(
//                project -> {
//                    ProjectDTO projectDTO = new ProjectDTO();
//                    projectDTO.setTitle(project.getTitle());
//                    projectDTO.setDescription(project.getDescription());
//                    return projectDTO;
//                }
//        ).collect(Collectors.toList());
//    }

    @Autowired
    public ModelMapper modelMapper;
    public List<ProjectDTO> getAllProjectsAsDto(){
        return projectRepository.findAll().stream().map(project -> modelMapper.map(project,ProjectDTO.class))
                .collect(Collectors.toList());
    }
}
