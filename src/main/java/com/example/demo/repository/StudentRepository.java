package com.example.demo.repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
Optional<Student> findByRolINumber(String rollNumber);
}