package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;

import com.examly.springapp.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {
	

}
