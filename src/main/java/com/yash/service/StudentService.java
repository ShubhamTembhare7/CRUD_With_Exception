package com.yash.service;

import java.util.List;

import com.yash.dto.Student;

public interface StudentService {
	
	public Student addstudent(Student student);
	
	public List<Student> addMultiStudent(List<Student> student);
	
	public List<Student> getAllStudents();
	
	public  void deleteStudentById(Integer id);
	
	public Student getStudentById(int id);
	
	public List<Student> getStudentByName(String name);
	
	public List<Student> getByNameStartingWith(String S);
	
	public Integer CountByName(String name);
	
	public List<Student> findByNameIgnoreCase(String name);
	
	public List<Student> getTop12ByName(String name);

}
