package com.example.crudspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudspring.model.Course;
import com.example.crudspring.repository.CourseRepository;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController{


    private CourseRepository courseRepository;

    
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }
}