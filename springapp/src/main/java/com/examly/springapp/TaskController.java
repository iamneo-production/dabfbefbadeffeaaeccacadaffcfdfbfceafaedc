package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class TaskController {
	@Autowired
    private TaskRepository taskRepo;
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/saveTask")
    public String saveTask(Task task) {
        taskRepo.save(task);
        return "index";
    }

    @RequestMapping(value = "/allTask", method = RequestMethod.GET)
    public ModelAndView findAllTasks(ModelAndView mav) {
        Iterable<Task> tasks = taskRepo.findAll();
        mav.addObject("tasks", tasks);
        mav.setViewName("getData");
        return mav;
    }

    @RequestMapping("/getTask")
    public ModelAndView getTask(@RequestParam String id) {

        ModelAndView mav = new ModelAndView("showTasks");
        Task task = taskRepo.findById(id).orElse(new Task());
        mav.addObject(task);
        return mav;
    }

    @RequestMapping("/changeStatus")
    public ModelAndView updateTask(Task task) {

        ModelAndView mav = new ModelAndView("updateTasks");
        task = taskRepo.findById(task.getTaskId()).orElse(new Task());
        taskRepo.deleteById(task.getTaskId());
        mav.addObject(task);
        return mav;
    }

    @RequestMapping("/deleteTask")
    public ModelAndView deleteTask(@RequestParam String id) {

        ModelAndView mav = new ModelAndView("deleteTask");
        Task task= taskRepo.findById(id).orElse(new Task());
        taskRepo.deleteById(id);
        mav.addObject(task);
        return mav;
    }

	/*
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

	@RequestMapping(method = RequestMethod.GET, value="/getTask/{id}")
	public List<Task> getSubject(@PathVariable String id, @RequestBody Task task)
	{
		return taskService.getData(id);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/deleteTask/{id}")
	public void deleteSubject(@PathVariable String id)
	{
		taskService.deleteSubject(id);
	}
	
	
	
	
	
	*/
	
	
}
