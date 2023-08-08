package com.examly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examly.bean.Task;
import com.examly.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	private TaskService taskService;

	@RequestMapping("/alltasks")
	public List<Task> getAllTask()
	{
		return subjectService.getAllSubjects();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/saveTask")
	public void addSub(@RequestBody Subject subject)
	{
		subjectService.addSubject(subject);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/changeTask/{id}")
	public void updateSubject(@PathVariable String id, @RequestBody Subject subject)
	{
		subjectService.updateSubject(id, subject);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/deleteTask/{id}")
	public void DeleteSubject(@PathVariable String id)
	{
		subjectService.deleteSubject(id);
	}
	
	
	
	
	
	
	
	
}
