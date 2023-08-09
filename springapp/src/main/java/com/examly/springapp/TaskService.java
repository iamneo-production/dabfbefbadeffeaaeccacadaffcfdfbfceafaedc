package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {
	@Autowired
	public TaskRepository taskRepo;
    public void addTask(Task task) {
		taskRepo.save(task);
		
	}

	public List<Task> getAllTask()
	{
		List<Task> tasks = new ArrayList<Task>();  
		taskRepo.findAll().forEach(task1 -> tasks.add(task1));  
		return tasks;  
	}

	public Task getTaskById(String id){
        return taskRepo.findById(id).get();  
	}

	public void deleteTask(String id) {
		taskRepo.deleteById(id);
		
	}

	public void updateTask(String id, Task task) {
		taskRepo.save(task);
		
	}
    
	
}
