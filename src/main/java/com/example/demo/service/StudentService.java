package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Student;

public interface StudentService {
    Student createStudent(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    Student updateStudent(Long id, Student student);
    Student getByRollNumber(String rollNumber);
}
