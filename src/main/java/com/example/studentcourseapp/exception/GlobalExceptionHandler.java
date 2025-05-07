package com.example.studentcourseapp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ConstraintViolationException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ModelAndView handleEntityNotFound(EntityNotFoundException ex) {
        ModelAndView mav = new ModelAndView("error");
        mav.addObject("message", "The requested entity was not found: " + ex.getMessage());
        return mav;
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ModelAndView handleConstraintViolation(ConstraintViolationException ex) {
        ModelAndView mav = new ModelAndView("error");
        mav.addObject("message", "Validation error: " + ex.getMessage());
        return mav;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleGeneralException(Exception ex) {
        ModelAndView mav = new ModelAndView("error");
        mav.addObject("message", "An error occurred: " + ex.getMessage());
        return mav;
    }
} 