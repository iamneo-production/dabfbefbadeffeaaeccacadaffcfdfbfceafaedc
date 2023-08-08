package com.examly.repo;

import org.springframework.data.repository.CrudRepository;

import com.examly.bean.Task;

public interface TaskRepository extends CrudRepository<Task,String> {
	

}
