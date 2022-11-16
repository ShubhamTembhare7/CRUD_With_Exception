package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dto.Student;
import com.yash.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addstudent(Student student) {	
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> getStudentByName(String name) {
		
		return studentRepository.findStudentByName(name);
	}

	@Override
	public List<Student> getByNameStartingWith(String S) {
	
		return studentRepository.findByNameStartingWith(S);
	}

	@Override
	public Integer CountByName(String name) {
		
		return studentRepository.countByName(name);
	}

	@Override
	public List<Student> findByNameIgnoreCase(String name) {
		
		return studentRepository.findByNameIgnoreCase(name);
	}

	@Override
	public List<Student> getTop12ByName(String name) {
		
		return studentRepository.findTop12ByName(name);
	}

	@Override
	public List<Student> addMultiStudent(List<Student> student) {
		
		return studentRepository.saveAll(student);
	}

	

	

}
