package com.example.studentcourseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcourseapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
} 