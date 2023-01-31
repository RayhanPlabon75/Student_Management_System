package com.studentmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.entities.Student;
import com.studentmanagement.repository.StudentRepository;
import com.studentmanagement.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}
	

}
