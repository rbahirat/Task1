package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import java.util.List;

@RestController
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudent()
	{
		return ResponseEntity.ok().body(studentService.getAllStudent());
	}
	
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable long id)
	{
		return ResponseEntity.ok().body(studentService.getStudentById(id));
	}
	
	
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> createStudent(@RequestBody Student student)
	{
		return ResponseEntity.ok().body(this.studentService.createStudent(student));
	}
	
	@PutMapping("/students/{id}")
		public ResponseEntity<Student> updateStudent(@PathVariable long id, @RequestBody Student student){
		
		student.setId(id);
		return ResponseEntity.ok().body(this.studentService.updateStudent(student));
		
	}
	
	@DeleteMapping("/students/{id}")
	public HttpStatus deleteStudent(@PathVariable long id){
		this.studentService.deleteStudent(id);
		return HttpStatus.OK;
	}
	
}
