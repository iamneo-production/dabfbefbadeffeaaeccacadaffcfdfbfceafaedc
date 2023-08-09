package com.examly.Repository;


import org.springframework.data.repository.CrudRepository;

import com.examly.model.taskmodel;



public interface TaskRepo extends CrudRepository<taskmodel,String> {
	

}
