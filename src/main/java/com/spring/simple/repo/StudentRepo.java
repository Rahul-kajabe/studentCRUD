package com.spring.simple.repo;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.spring.simple.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer>{

}
