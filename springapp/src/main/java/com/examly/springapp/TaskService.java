package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {
	@Autowired
	public TaskRepo repo;

	public List<TaskModel> getAllTasks()
	{
		return (List<TaskModel>) repo.findAll();
	}

	public void addTask(TaskModel model) {
		repo.save(model);
		
	}

	public void updateTask(String id, TaskModel model) {
		repo.save(model);
		
	}

	
    public TaskModel getTaskById(String id) {
        return repo.findById(id);
    }
	

	public void deleteTask(String id) {
		repo.deleteById(id);
	}
}