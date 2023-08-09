package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.*;
import com.examly.springapp.service.*;


@RestController
public class TaskController {
	@Autowired
	private TaskService service;

	@RequestMapping("/alltasks")
	public List<taskmodel> getAllTasks()
	{
		return service.getAllTasks();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/saveTask")
	public void addTask(@RequestBody taskmodel model)
	{
		service.addTask(model);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/changeStatus/{id}")
	public void updateTask(@PathVariable String id, @RequestBody taskmodel model)
	{
		service.updateTask(id, model);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/deleteTask/{id}")
	public void DeleteSubject(@PathVariable String id)
	{
		service.deleteTask(id);
	}
	
	
	
	
	
	
	
	
}
