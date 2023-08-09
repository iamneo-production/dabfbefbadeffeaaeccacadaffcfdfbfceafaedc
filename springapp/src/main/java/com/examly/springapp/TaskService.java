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
		return (List<TaskModel>) repo.findAll();
	}

	public void addTask(TaskModel model) {
		repo.save(model);
		
	}

	public void updateTask(String id, TaskModel model) {
		repo.save(model);
		
	}

	@Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }
	public void getTaskById(String id, TaskModel model) {
		repo.findById(id);
		
	}

	public void deleteTask(String id) {
		repo.deleteById(id);
	}
}