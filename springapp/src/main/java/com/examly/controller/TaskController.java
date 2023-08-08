package com.examly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examly.bean.Task;
import com.examly.service.*;

@RestController
public class TaskController {
	@Autowired
	private TaskService taskService;

	@RequestMapping("/alltasks")
	public List<Task> getAllSubjects()
	{
		return taskService.getAllSubjects();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/saveTask")
	public void addSubject(@RequestBody Task task)
	{
		taskService.addSubject(task);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/changeStatus/{id}")
	public void updateSubject(@PathVariable String id, @RequestBody Task task)
	{
		taskService.updateSubject(id, task);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/deleteTask/{id}")
	public void DeleteSubject(@PathVariable String id)
	{
		taskService.deleteSubject(id);
	}
	
	
	
	
	
	
	
	
}
