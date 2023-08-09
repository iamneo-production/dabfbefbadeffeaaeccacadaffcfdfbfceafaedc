package com.examly.springapp;


import org.springframework.data.repository.CrudRepository;




public interface TaskRepo extends CrudRepository<TaskModel,String> {
	

}
