package com.yash.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	public List<Student> findStudentByName(String name);
	
	public List<Student> findByNameStartingWith(String S);
	
	public Integer countByName(String name);
	
	public List<Student> findByNameIgnoreCase(String name);
	
	public List<Student> findTop12ByName(String name);
}
