package com.examly.repo;

import org.springframework.data.repository.CrudRepository;



public interface TaskRepository extends CrudRepository<Task,String> {
	

}
