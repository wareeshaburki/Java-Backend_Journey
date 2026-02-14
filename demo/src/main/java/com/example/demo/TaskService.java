package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
