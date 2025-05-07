package com.example.studentcourseapp.service;

import com.example.studentcourseapp.entity.Course;
import com.example.studentcourseapp.repository.CourseRepository;
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
public class CourseServiceTest {

    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseService courseService;

    @Test
    public void testGetAllCourses() {
        Course course1 = new Course();
        course1.setId(1L);
        course1.setName("Java Programming");

        Course course2 = new Course();
        course2.setId(2L);
        course2.setName("Python Programming");

        when(courseRepository.findAll()).thenReturn(Arrays.asList(course1, course2));

        List<Course> courses = courseService.getAllCourses();

        assertEquals(2, courses.size());
        verify(courseRepository, times(1)).findAll();
    }

    @Test
    public void testGetCourseById() {
        Course course = new Course();
        course.setId(1L);
        course.setName("Java Programming");

        when(courseRepository.findById(1L)).thenReturn(Optional.of(course));

        Optional<Course> found = courseService.getCourseById(1L);

        assertTrue(found.isPresent());
        assertEquals("Java Programming", found.get().getName());
        verify(courseRepository, times(1)).findById(1L);
    }

    @Test
    public void testSaveCourse() {
        Course course = new Course();
        course.setName("Java Programming");

        when(courseRepository.save(any(Course.class))).thenReturn(course);

        Course saved = courseService.saveCourse(course);

        assertNotNull(saved);
        assertEquals("Java Programming", saved.getName());
        verify(courseRepository, times(1)).save(course);
    }
} 