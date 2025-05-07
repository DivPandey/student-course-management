<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <title>Students</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        </head>

        <body>
            <div class="container mt-4">
                <h2>Students</h2>
                <a href="/students/new" class="btn btn-primary mb-3">Add New Student</a>

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${students}" var="student">
                            <tr>
                                <td>${student.id}</td>
                                <td>${student.name}</td>
                                <td>${student.email}</td>
                                <td>
                                    <a href="/students/edit/${student.id}" class="btn btn-sm btn-warning">Edit</a>
                                    <a href="/students/delete/${student.id}" class="btn btn-sm btn-danger"
                                        onclick="return confirm('Are you sure?')">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <a href="/courses" class="btn btn-secondary">View Courses</a>
            </div>
        </body>

        </html>