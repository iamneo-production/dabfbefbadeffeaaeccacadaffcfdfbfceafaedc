

package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskServiceImpl implements TaskService {
   
    @Autowired
	public TaskRepo repo;

    public TaskServiceImpl(TaskRepo repo) {
        this.repo = repo;
    }
	

	public List<TaskModel> getAllTasks()
	{
		return repo.findAll();
	}

	public void addTask(TaskModel model) {
		repo.save(model);
		
	}

	public void updateTask(String id, TaskModel model) {
		repo.save(model);
		
	}

	
    public TaskModel getTaskById(String id) {
        Optional<TaskModel> task = repo.findById(id);
        if (task.isPresent()) {
            return task.get();
        }
        else {
            return null;
        }
    }
	

	public void deleteTask(String id) {
		repo.deleteById(id);
	}
}