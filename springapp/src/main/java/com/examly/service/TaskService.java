package com.examly.

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.bean.Task;
import com.examly.repo.TaskRepository;

@Service
public class TaskService {
	@Autowired
	public TaskRepository taskRepo;

	public List<Task> getAllTask()
	{
		List<Task> tasks = new ArrayList<>();
		taskRepo.findAll().forEach(tasks::add);
		return tasks;
	}

	public void addTask(Task task) {
		taskRepo.save(task);
		
	}

	public void updateTask(String id, Task task) {
		taskRepo.save(task);
		
	}

	public void deleteTask(String id) {
		taskRepo.deleteById(id);
		
	}
}
