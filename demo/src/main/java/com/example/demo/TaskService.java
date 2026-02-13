package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void saveTask(Task task){
        taskRepository.save(task);
    }

    public List<Task> getPendingTasks(){
        return taskRepository.findByIsCompletedFalse();
    }
}
