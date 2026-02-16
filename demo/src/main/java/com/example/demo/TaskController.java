package com.example.demo;

import com.example.demo.dtos.TaskDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/save-task")
    public String saveTask(@Valid @RequestBody Task task) {
        taskService.saveTask(task);
        return "Task " + task.getTaskName() + " has been saved";
    }

    @GetMapping("/get-task-by-id/{id}")
    public Task getTaskById(@PathVariable int id) {
        return taskService.getTaskWithId(id);
    }

    @GetMapping("/get-all-tasks")
    public List<TaskDTO> getAllTasks(){
        return taskService.getAllTasksAsDto();
    }

    @GetMapping("/get-pending-tasks")
    public List<Task> getPendingTasks() {
        return taskService.getPendingTasks();
    }
}
