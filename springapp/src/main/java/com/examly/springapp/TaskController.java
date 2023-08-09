package com.examly.springapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TaskController {
	@Autowired
	private TaskService service;

	@GetMapping("/alltasks")
    public List<TaskModel> getAllTasks() {
        return service.getAllTasks();
    }
	
	@RequestMapping(method = RequestMethod.POST, value="/saveTask")
	public void addTask(@RequestBody TaskModel model)
	{
		service.addTask(model);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/changeStatus/{id}")
	public void updateTask(@PathVariable String id, @RequestBody TaskModel model)
	{
		service.updateTask(id, model);
	}

	@GetMapping("/getTask/{id}")
    public ResponseEntity<TaskModel> getTaskById(@PathVariable("id") String id) {
        ResponseEntity<TaskModel> matchtask = new ResponseEntity<TaskModel>(service.getTaskById(id), HttpStatus.OK);
        return matchtask;
    }
	
	@RequestMapping(method = RequestMethod.DELETE, value="/deleteTask/{id}")
	public void deleteTask(@PathVariable String id)
	{
		service.deleteTask(id);
	}
	
	
	
	
	
	
	
	
}
