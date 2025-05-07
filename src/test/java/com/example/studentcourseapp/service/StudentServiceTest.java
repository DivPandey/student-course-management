package com.example.studentcourseapp.service;

import com.example.studentcourseapp.entity.Student;
import com.example.studentcourseapp.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    @Test
    public void testGetAllStudents() {
        Student student1 = new Student();
        student1.setId(1L);
        student1.setName("John Doe");

        Student student2 = new Student();
        student2.setId(2L);
        student2.setName("Jane Doe");

        when(studentRepository.findAll()).thenReturn(Arrays.asList(student1, student2));

        List<Student> students = studentService.getAllStudents();

        assertEquals(2, students.size());
        verify(studentRepository, times(1)).findAll();
    }

    @Test
    public void testGetStudentById() {
        Student student = new Student();
        student.setId(1L);
        student.setName("John Doe");

        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));

        Optional<Student> found = studentService.getStudentById(1L);

        assertTrue(found.isPresent());
        assertEquals("John Doe", found.get().getName());
        verify(studentRepository, times(1)).findById(1L);
    }

    @Test
    public void testSaveStudent() {
        Student student = new Student();
        student.setName("John Doe");

        when(studentRepository.save(any(Student.class))).thenReturn(student);

        Student saved = studentService.saveStudent(student);

        assertNotNull(saved);
        assertEquals("John Doe", saved.getName());
        verify(studentRepository, times(1)).save(student);
    }
} 