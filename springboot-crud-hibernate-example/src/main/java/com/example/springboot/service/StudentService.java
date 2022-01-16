package com.example.springboot.service;
import java.util.List;

import com.example.springboot.model.Student;


public interface StudentService {
	Student createStudent(Student student);
	
	Student updateStudent(Student student);
	
	List<Student> getAllStudent();
	
	Student getStudentById(long studentId);
	
	void deleteStudent(long id);

	
}
