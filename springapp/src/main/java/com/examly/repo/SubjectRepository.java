package com.examly.springapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.examly.springapp.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {
	

}
