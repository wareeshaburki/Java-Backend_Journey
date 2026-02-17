package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import com.example.demo.dtos.TaskDTO;
import com.example.demo.exceptions.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void saveTask(Task task) {
        taskRepository.save(task);
    }

    @Autowired
    public ModelMapper modelMapper;

    public List<TaskDTO> getAllTasksAsDto() {
//        return taskRepository.findAll().stream().map(
//                task -> {
//                    TaskDTO taskDTO = new TaskDTO();
//                    taskDTO.setTaskName(task.getTaskName());
//                    taskDTO.setCompleted(task.isCompleted());
//                    return taskDTO;
//                }
//        ).collect(Collectors.toList());
        return taskRepository.findAll().stream().map(task -> modelMapper.map(task, TaskDTO.class)).collect(Collectors.toList());
    }

    public List<Task> getPendingTasks() {
        return taskRepository.findByIsCompletedFalse();
    }

    public Task getTaskWithId(int id) {
        return taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found!"));
    }

    public void deleteTask(int id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found with id " + id + "!"));
        taskRepository.delete(task);
    }
}
