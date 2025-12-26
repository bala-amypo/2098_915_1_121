package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class StudentController {

    private StudentService service;

    // ✅ REQUIRED
    public StudentController() {}

    // ✅ REQUIRED
    public StudentController(StudentService service) {
        this.service = service;
    }

    public ResponseEntity<Student> add(Student s) {
        return ResponseEntity.ok(service.addStudent(s));
    }

    public ResponseEntity<List<Student>> list() {
        return ResponseEntity.ok(service.getAllStudents());
    }
}
