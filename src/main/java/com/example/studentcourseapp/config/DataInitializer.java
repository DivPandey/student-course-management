package com.example.studentcourseapp.config;

import com.example.studentcourseapp.entity.Student;
import com.example.studentcourseapp.entity.Course;
import com.example.studentcourseapp.repository.StudentRepository;
import com.example.studentcourseapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void run(String... args) {
        // Create courses
        Course java = new Course();
        java.setName("Java Programming");
        java.setDescription("Learn Java programming language");

        Course python = new Course();
        python.setName("Python Programming");
        python.setDescription("Learn Python programming language");

        Course webDev = new Course();
        webDev.setName("Web Development");
        webDev.setDescription("Learn HTML, CSS, and JavaScript");

        Course dataScience = new Course();
        dataScience.setName("Data Science");
        dataScience.setDescription("Learn data analysis and machine learning");

        Course database = new Course();
        database.setName("Database Management");
        database.setDescription("Learn SQL and database design");

        courseRepository.saveAll(Arrays.asList(java, python, webDev, dataScience, database));

        // Create students
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student();
            students[i].setName("Student " + (i + 1));
            students[i].setEmail("student" + (i + 1) + "@example.com");
        }

        // Assign courses to students
        students[0].setCourses(new HashSet<>(Arrays.asList(java, python)));
        students[1].setCourses(new HashSet<>(Arrays.asList(webDev, database)));
        students[2].setCourses(new HashSet<>(Arrays.asList(dataScience, java)));
        students[3].setCourses(new HashSet<>(Arrays.asList(python, webDev)));
        students[4].setCourses(new HashSet<>(Arrays.asList(database, dataScience)));
        students[5].setCourses(new HashSet<>(Arrays.asList(java, database)));
        students[6].setCourses(new HashSet<>(Arrays.asList(python, dataScience)));
        students[7].setCourses(new HashSet<>(Arrays.asList(webDev, java)));
        students[8].setCourses(new HashSet<>(Arrays.asList(database, python)));
        students[9].setCourses(new HashSet<>(Arrays.asList(dataScience, webDev)));

        studentRepository.saveAll(Arrays.asList(students));
    }
} 