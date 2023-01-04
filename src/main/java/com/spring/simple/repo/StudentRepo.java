package com.spring.simple.repo;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.spring.simple.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Serializable>{
	
	@Query(value = "select * from student_table c where student_city=?1 ",nativeQuery = true   )//native query
	public List<Student> getAllStudentByCity(String city);

}
