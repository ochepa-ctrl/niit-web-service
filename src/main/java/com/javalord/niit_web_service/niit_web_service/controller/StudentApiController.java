package com.javalord.niit_web_service.niit_web_service.controller;

import com.javalord.niit_web_service.niit_web_service.model.entity.Student;
import com.javalord.niit_web_service.niit_web_service.model.request.CreateStudent;
import com.javalord.niit_web_service.niit_web_service.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/students")
public class StudentApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentApiController.class);
    private StudentService studentService;

    public StudentApiController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public String addStudent(@RequestBody CreateStudent createStudent) {
        Student student = new Student();
        return "Added successfully";


    }

    @GetMapping(value = "/{studentId}")
    public Student findStudentById(@PathVariable(value = "studentId") int id) {
        Student student = studentService.findStudentById(id);

        return student;
    }

    @GetMapping
    public List<Student> findAllStudents() {
        List<Student> students = studentService.findAllStudents();

        return students;
    }

    @PostMapping(value = "/{studentId}/courses")
    public String enrollForACourse() {

        return "Course enrolled!";
    }
}

//Entity
//Request
//Response
