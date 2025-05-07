<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <title>Courses</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        </head>

        <body>
            <div class="container mt-4">
                <h2>Courses</h2>
                <a href="/courses/new" class="btn btn-primary mb-3">Add New Course</a>

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${courses}" var="course">
                            <tr>
                                <td>${course.id}</td>
                                <td>${course.name}</td>
                                <td>${course.description}</td>
                                <td>
                                    <a href="/courses/edit/${course.id}" class="btn btn-sm btn-warning">Edit</a>
                                    <a href="/courses/delete/${course.id}" class="btn btn-sm btn-danger"
                                        onclick="return confirm('Are you sure?')">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <a href="/students" class="btn btn-secondary">View Students</a>
            </div>
        </body>

        </html>