# Student Course Management System

A Spring Boot application for managing students and their course enrollments. This application demonstrates the implementation of basic CRUD operations using Spring Boot, JPA, and JSP.

## Features

- Create, Read, Update, and Delete operations for Students and Courses
- Many-to-Many relationship between Students and Courses
- JSP views with Bootstrap styling
- H2 in-memory database
- Sample data initialization
- Exception handling
- Unit tests for service layer

## Technologies Used

- Java 17
- Spring Boot 3.2.3
- Spring Data JPA
- Spring MVC
- JSP (JavaServer Pages)
- H2 Database
- Maven
- Bootstrap 5.1.3
- JUnit 5
- Mockito

## Project Structure

```
src/
└── main/
    ├── java/
    │   └── com/
    │       └── example/
    │           └── studentcourseapp/
    │               ├── StudentCourseAppApplication.java
    │               ├── entity/
    │               │   ├── Student.java
    │               │   └── Course.java
    │               ├── repository/
    │               │   ├── StudentRepository.java
    │               │   └── CourseRepository.java
    │               ├── service/
    │               │   ├── StudentService.java
    │               │   └── CourseService.java
    │               ├── controller/
    │               │   ├── StudentController.java
    │               │   └── CourseController.java
    │               └── config/
    │                   └── WebConfig.java
    ├── resources/
    │   ├── application.properties
    │   └── static/
    └── webapp/
        └── WEB-INF/
            └── views/
                ├── student-form.jsp
                ├── students.jsp
                ├── course-form.jsp
                └── courses.jsp
```

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

### Running the Application

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd demo
   ```

2. Run the application using Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Access the application:
   - Open your web browser and navigate to `http://localhost:8080`
   - You will be redirected to the students list page
   - Navigate between students and courses using the provided links

### Running Tests

```bash
./mvnw test
```

## API Endpoints

### Students
- GET `/students` - List all students
- GET `/students/new` - Show form to add a new student
- POST `/students` - Create a new student
- GET `/students/edit/{id}` - Show form to edit a student
- GET `/students/delete/{id}` - Delete a student

### Courses
- GET `/courses` - List all courses
- GET `/courses/new` - Show form to add a new course
- POST `/courses` - Create a new course
- GET `/courses/edit/{id}` - Show form to edit a course
- GET `/courses/delete/{id}` - Delete a course

## Database

The application uses H2 in-memory database, which means:
- Data is not persistent and will be reset when the application restarts
- Sample data is automatically loaded on startup
- 10 students and 5 courses are created with relationships

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details 