package com.spring.simple.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.simple.model.Student;
import com.spring.simple.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {//  /student/getData
	//http://localhost/8090/student/save
	@Autowired(required = true)
	private StudentService studentService;
	
    @PostMapping("/save")
	public ResponseEntity<Student>  saveStudent(@RequestBody Student student){
		
	Student student1=	studentService.saveStudent(student);
		
		return ResponseEntity.ok().body(student1);
		
	}
	
    @GetMapping("/get/{id}")
   public ResponseEntity<Optional<Student>> getStudentById(@PathVariable ("id") Integer id){
    	 Optional<Student> stu=studentService.findById(id);
    	 return ResponseEntity.ok().body(stu);
    	
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable ("id") Integer id){
     	 studentService.deleteById(id);
     	
     	
     }
    @GetMapping("/getCity/{city}")
   public ResponseEntity<List<Student>> getAllStudentByCity(@PathVariable ("city") String studentCity){
    	List<Student> student=studentService.getAllStudentByCity(studentCity);
    	 return ResponseEntity.ok().body(student);
   }
    @GetMapping("/list")
    public List<String> getList(){
    	List<String> list=new ArrayList<>();
    	list.add("1");
    	list.add("2");
    	list.add("3");
    	list.add("4");
    	return list;
    }
	
}
