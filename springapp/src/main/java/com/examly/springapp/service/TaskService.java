package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.repository.TaskRepo;
import com.examly.springapp.model.Taskmodel;

@Service
public class TaskService {
	
	@Autowired
	public TaskRepo repo;

	public List<Taskmodel> getAllTasks()
	{
		List<Taskmodel> list = new ArrayList<Taskmodel>();
		repo.findAll().forEach(list::add);
		return list;
	}

	public Taskmodel addTask(Taskmodel model) {
		return repo.save(model);
		
	}
	
	public Taskmodel getTaskById(String task_id) {
		return repo.findById(task_id).orElse(null);
		
	}

	public Taskmodel updateTask(String id, Taskmodel model) {
		Taskmodel updmodel = repo.findById(model.getTaskId()).orElseGet(null); 
		if(updmodel!=null) {
			updmodel.setTaskDate(model.getTaskDate());
			updmodel.setTaskHolderName(model.getTaskHolderName());
			updmodel.setTaskName(model.getTaskName());
			updmodel.setTaskStatus(model.getTaskStatus());
			repo.save(updmodel);
			return updmodel;
			
		}
		return repo.save(model);
		
	}

	public void deleteTask(String id) {
		repo.deleteById(id);
	}
}