<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <title>Student Form</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        </head>

        <body>
            <div class="container mt-4">
                <h2>${student.id == null ? 'Add New Student' : 'Edit Student'}</h2>

                <form action="/students" method="post">
                    <input type="hidden" name="id" value="${student.id}">

                    <div class="mb-3">
                        <label for="name" class="form-label">Name</label>
                        <input type="text" class="form-control" id="name" name="name" value="${student.name}" required>
                    </div>

                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="email" name="email" value="${student.email}"
                            required>
                    </div>

                    <button type="submit" class="btn btn-primary">Save</button>
                    <a href="/students" class="btn btn-secondary">Cancel</a>
                </form>
            </div>
        </body>

        </html>