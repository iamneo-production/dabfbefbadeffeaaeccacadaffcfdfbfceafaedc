package com.examly.springapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.*;


@Repository
public interface TaskRepo extends JpaRepository<Taskmodel,String> {

	

}
