package com.examly.springapp.Repository;


import org.springframework.data.repository.CrudRepository;

import com.examly.springapp.model.taskmodel;



public interface TaskRepo extends CrudRepository<taskmodel,String> {
	

}
