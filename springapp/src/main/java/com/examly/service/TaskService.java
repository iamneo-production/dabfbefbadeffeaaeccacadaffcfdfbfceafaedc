package com.examly.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.Repository.TaskRepo;
import com.examly.model.taskmodel;

@Service
public class TaskService {
	@Autowired
	public TaskRepo repo;

	public List<taskmodel> getAllTasks()
	{
		List<taskmodel> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	}

	public void addTask(taskmodel model) {
		repo.save(model);
		
	}

	public void updateTask(String id, taskmodel model) {
		repo.save(model);
		
	}

	public void deleteTask(String id) {
		repo.deleteById(id);
	}
}