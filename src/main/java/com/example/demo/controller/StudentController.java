package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import java.util.List;

public class StudentController {

    private StudentService service;

    public StudentController(StudentService s){ this.service = s; }
    public StudentController(){}

    public Student add(Student s){ return s; }
    public List<Student> list(){ return List.of(); }
}
