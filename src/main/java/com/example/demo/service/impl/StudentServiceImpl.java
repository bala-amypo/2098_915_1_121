package com.example.demo.service.impl;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo){ this.repo = repo; }
    public StudentServiceImpl(){}

    public Student add(Student s){ return s; }
    public List<Student> list(){ return List.of(); }
}
