package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {
	@Autowired
	public TaskRepository taskRepo;

	public List<Task> getAllSubjects()
	{
		List<Task> task = new ArrayList<>();
		taskRepo.findAll().forEach(task::add);
		return task;
	}

	public List<Task> getData(String id)
	{
		List<Task> task = new ArrayList<>();
		taskRepo.findById(id);
		return task;
	}

	public void addSubject(Task task) {
		taskRepo.save(task);
		
	}

	public void updateSubject(String id, Task task) {
		taskRepo.save(task);
		
	}

	public void deleteSubject(String id) {
		taskRepo.deleteById(id);
		
	}
}