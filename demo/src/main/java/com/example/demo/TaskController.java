package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/save-task")
    public String saveTask(@RequestBody Task task){
        taskService.saveTask(task);
        return "Task " + task.getTaskName() + " has been saved";
    }

    @GetMapping("/get-pending-tasks")
    public List<Task> getPendingTasks(){
        return taskService.getPendingTasks();
    }
}
