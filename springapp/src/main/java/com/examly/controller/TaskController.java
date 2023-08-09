package com.examly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/alltasks")
	public List<Task> getAllTask()
	{
		return taskService.getAllTask();
	}
	@GetMapping("/getTask/{id}")  
	public Task getTaskById(@PathVariable("taskId") String id)   
	{  
		return taskService.getTaskById(id);  
	}  
	@RequestMapping(method = RequestMethod.POST, value="/saveTask")
	public void addTask(@RequestBody Task task)
	{
		taskService.addTask(task);
	}
                   
	@RequestMapping(method = RequestMethod.GET, value="/changeStatus/{id}")
	public void updateTask(@PathVariable String id, @RequestBody Task task)
	{
		taskService.updateTask(id, task);
	}
	@DeleteMapping("/deleteTask/{id}")  
	public void deleteTask(@PathVariable("taskId") String id)   
	{  
		taskService.deleteTask(id);  
	}  
	
}