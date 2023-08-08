package com.examly.repo;

import org.springframework.data.repository.CrudRepository;

import com.examly.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {
	

}
