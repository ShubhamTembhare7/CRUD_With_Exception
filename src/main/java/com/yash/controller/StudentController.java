package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.dto.Student;
import com.yash.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student addstudent = studentService.addstudent(student);
		return new ResponseEntity<Student>(addstudent,HttpStatus.CREATED);
		
	}
	
	@PostMapping("/saveAll")
	public ResponseEntity<List<Student>> addAllStudent(@RequestBody List<Student> student) {
		List<Student> addstudent = studentService.addMultiStudent(student);
		return new ResponseEntity<List<Student>>(addstudent,HttpStatus.CREATED);
		
	}
	
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents(){
		
		List<Student> allStudents = studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(allStudents,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<Void> deleteStudentById(@PathVariable("studentId")Integer studentId ){
		studentService.deleteStudentById(studentId);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<Student> getById(@PathVariable("id") int id)
	{
		Student studentById = studentService.getStudentById(id);
		return new ResponseEntity<Student>(studentById,HttpStatus.FOUND);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		Student savestudent = studentService.addstudent(student);
		return new ResponseEntity<Student>(savestudent,HttpStatus.CREATED);
		
	}
	@GetMapping("/getStudentByName/{name}")
	public ResponseEntity<List<Student>> getStudentByName(@PathVariable("name") String name){
		List<Student> studentByName = studentService.getStudentByName(name);
		return new ResponseEntity<List<Student>>(studentByName,HttpStatus.FOUND);
				
	}
	
	// second way to find by Name
	@GetMapping("/studentByName/{name}")
	public List<Student> getByName(@PathVariable String name)
	{
		return studentService.getStudentByName(name);
	}
	

	@GetMapping("/getNameStartWith/{name}")
	public ResponseEntity<List<Student>> getStudentByNameStartWithS(@PathVariable("name") String name){
		 
		List<Student> student = studentService.getByNameStartingWith(name);
		return new ResponseEntity<List<Student>>(student,HttpStatus.FOUND);
	}
	
	@GetMapping("/count/{name}")
	public ResponseEntity<Integer> CountByName(@PathVariable String name){
	 Integer countByName = studentService.CountByName(name);
	 return new ResponseEntity<Integer>(countByName,HttpStatus.FOUND);		
		
	}
	
	@GetMapping("/Ignore/{name}")
	public ResponseEntity<List<Student>> findByNameIgnoreCase(@PathVariable String name){
		
		List<Student> findByNameIgnoreCase = studentService.findByNameIgnoreCase(name);
		
		return new ResponseEntity<List<Student>>(findByNameIgnoreCase,HttpStatus.OK);
	}
	
	@GetMapping("/Top/{name}")
	public ResponseEntity<List<Student>> getTop12ByName(@PathVariable String name){
		
		List<Student> top12ByName = studentService.getTop12ByName(name);
		
		return new ResponseEntity<List<Student>>(top12ByName,HttpStatus.OK);
	}
}
