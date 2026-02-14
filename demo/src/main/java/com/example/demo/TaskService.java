package com.example.demo;

import java.util.List;

import com.example.demo.exceptions.ResourceNotFoundException;
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

    public Task getTaskWithId(int id){
        return taskRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Task not found!"));
    }

    public void deleteTask(int id){
        Task task = taskRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Task not found with id " + id + "!"));
        taskRepository.delete(task);
    }
}
