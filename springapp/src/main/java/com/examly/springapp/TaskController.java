package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TaskController {
	@Autowired
	private TaskService taskService;
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
    public ModelAndView findAllUsers(ModelAndView mav) {
        List<Task> tasks = taskRepo.findAll();
        mav.addObject("tasks", tasks);
        mav.setViewName("getData");
        return mav;
    }

    @RequestMapping("/getTask")
    public ModelAndView getuser(@RequestParam int id) {

        ModelAndView mav = new ModelAndView("showUser");
        User user = userdao.findById(id).orElse(new User());
        mav.addObject(user);
        return mav;
    }

    @RequestMapping("/changeStatus")
    public ModelAndView updateuser(User user) {

        ModelAndView mav = new ModelAndView("updateUser");
        user = userdao.findById(user.getTaskId()).orElse(new User());
        userdao.deleteById(user.getTaskId());
        mav.addObject(user);
        return mav;
    }

    @RequestMapping("/deleteTask")
    public ModelAndView deleteuser(@RequestParam int id) {

        ModelAndView mav = new ModelAndView("deleteUser");
        User user = userdao.findById(id).orElse(new User());
        userdao.deleteById(id);
        mav.addObject(user);
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
