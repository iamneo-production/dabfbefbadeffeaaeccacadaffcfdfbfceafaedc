package com.examly.springapp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TaskRepo extends JpaRepository<TaskModel,String> {
	

}
