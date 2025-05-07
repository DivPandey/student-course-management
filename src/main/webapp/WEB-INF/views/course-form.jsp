<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <title>Course Form</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        </head>

        <body>
            <div class="container mt-4">
                <h2>${course.id == null ? 'Add New Course' : 'Edit Course'}</h2>

                <form action="/courses" method="post">
                    <input type="hidden" name="id" value="${course.id}">

                    <div class="mb-3">
                        <label for="name" class="form-label">Name</label>
                        <input type="text" class="form-control" id="name" name="name" value="${course.name}" required>
                    </div>

                    <div class="mb-3">
                        <label for="description" class="form-label">Description</label>
                        <textarea class="form-control" id="description" name="description"
                            rows="3">${course.description}</textarea>
                    </div>

                    <button type="submit" class="btn btn-primary">Save</button>
                    <a href="/courses" class="btn btn-secondary">Cancel</a>
                </form>
            </div>
        </body>

        </html>