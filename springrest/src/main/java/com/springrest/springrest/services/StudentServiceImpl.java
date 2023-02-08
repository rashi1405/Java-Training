 package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	List<Student>list ;
	
	public StudentServiceImpl() {
		list = new ArrayList<>();
		list.add(new Student(1,"Rashi",20));
		list.add(new Student(2,"Samruddhi",16));
	}

	@Override
	public List<Student> getStudents() {
	    return list;
	}

	@Override
	public Student getStudent(long studentId) {
		Student s = null;
		
		for(Student student:list) {
			if(student.getId() == studentId) {
				s = student;
				break;
			}
		}
		return s;
	}

	@Override
	public Student addStudent(Student student) {
		list.add(student);
		return student;
	}


	@Override
	public Student updateStudent(Student student) {
		list.forEach(e -> {
			if(e.getId() == student.getId()) {
				e.setName(student.getName()) ;
				e.setAge(student.getAge()) ;
			}
		});
		return student ;
	}
	
	
	@Override
	public Student deleteStudent(long parseLong) {
		 Student s = null;
		
		for(Student student:list) {
			if(student.getId() == parseLong) {
				s = student;
				list.remove(student);
				break;
			}
		}
		return s;
	}

}
