package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {
	@Autowired
	public TaskRepo repo;

	public List<TaskModel> getAllTasks()
	{
		List<TaskModel> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	}

	public void addTask(TaskModel model) {
		repo.save(model);
		
	}

	public void updateTask(String id, TaskModel model) {
		repo.save(model);
		
	}

	public void deleteTask(String id) {
		repo.deleteById(id);
	}
}