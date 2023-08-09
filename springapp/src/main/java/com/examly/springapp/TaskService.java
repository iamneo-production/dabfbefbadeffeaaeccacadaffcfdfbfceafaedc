package com.examly.springapp;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface TaskService {
	void addTask(@RequestBody TaskModel model);
    List<TaskModel> getAllTasks();
    TaskModel getTaskById(String id);
	
	void updateTask(@PathVariable String id, @RequestBody TaskModel model);
	void deleteTask(@PathVariable String id);
}