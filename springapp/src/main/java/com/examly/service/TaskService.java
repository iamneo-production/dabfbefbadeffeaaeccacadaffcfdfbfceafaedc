package com.examly.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.bean.*;
import com.examly.repo.*;

@Service
public class TaskService {
	@Autowired
	public TaskRepository taskRepo;

	public List<Task> getAllSubjects()
	{
		List<Task> tasklist = new ArrayList<>();
		taskRepo.findAll().forEach(tasklist::add);
		return tasklist;
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
