package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Student;
import com.springrest.springrest.services.StudentService;
import java.util.List;

@RestController 
public class MyController {
	
	@Autowired 
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student>getStudents() {
		return this.studentService.getStudents();
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable String studentId) {
		return this.studentService.getStudent(Long.parseLong(studentId)) ;
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return this.studentService.addStudent(student);
	}
	
	@PutMapping("/students") 
	public Student updateStudent(@RequestBody Student student) {
		return this.studentService.updateStudent(student) ;
	}
	
	@DeleteMapping("/students/{studentId}") 
	public String deleteStudent(@PathVariable String studentId)  
	{
	      return this.studentService.deleteStudent(Long.parseLong(studentId));
	}
}
