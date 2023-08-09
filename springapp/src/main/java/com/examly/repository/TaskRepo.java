package com.examly.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.model.taskmodel;


@Repository
public interface TaskRepo extends CrudRepository<taskmodel,String> {
	

}
