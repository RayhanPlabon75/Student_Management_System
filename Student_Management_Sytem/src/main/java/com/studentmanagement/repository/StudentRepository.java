package com.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagement.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
