package com.javalord.niit_web_service.niit_web_service.controller;

import com.javalord.niit_web_service.niit_web_service.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/students")
public class StudentApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentApiController.class);

    @PostMapping
    public String createStudent(@RequestBody Student student) {
        System.out.println(student);
        LOGGER.info("NEW STUDENT: {}", student);

        return "Student created successfully!";
    }

    @GetMapping
    public String testGet() {
        return "Student retrieved successfully!";
    }

}

