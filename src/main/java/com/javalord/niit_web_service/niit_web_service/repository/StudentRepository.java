package com.javalord.niit_web_service.niit_web_service.repository;

import com.javalord.niit_web_service.niit_web_service.model.Course;
import com.javalord.niit_web_service.niit_web_service.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findById(int id);

    List<Student> findByCurrentCoursesContaining(Course course);

}
