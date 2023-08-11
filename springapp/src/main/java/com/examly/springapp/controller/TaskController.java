package com.examly.springapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.*;
import com.examly.springapp.repository.*;
import com.examly.springapp.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	TaskService service;

	@PostMapping("/saveTask")
	public Taskmodel saveTask(@RequestBody Taskmodel model) {
		return service.addTask(model);
	}

	@GetMapping("/alltasks")
	public List<Taskmodel> getAllTasks() {
		return service.getAllTasks();
	}
    
	@GetMapping("/getTask/{id}")
	public Taskmodel getTaskById(@PathVariable String id) {
		return service.getTaskById(id);
	}
    
	@PutMapping("/changeStatus/{id}")
	public Taskmodel updateTaskById(@PathVariable String id, @RequestBody Taskmodel model) {
		return service.updateTask(id, model);
	}

	@DeleteMapping("/deleteTask/{id}")
	public void deleteTaskById(@PathVariable String id) {
		service.deleteTask(id);
	}
	
	
	
}