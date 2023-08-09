package com.example.Repository;


import org.springframework.data.repository.CrudRepository;

import com.example.model.taskmodel;



public interface TaskRepo extends CrudRepository<taskmodel,String> {
	

}
