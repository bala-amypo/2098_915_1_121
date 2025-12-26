package com.example.demo.service.impl;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository repository;

    public StudentServiceImpl() {}

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student add(Student student) {
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }
}
