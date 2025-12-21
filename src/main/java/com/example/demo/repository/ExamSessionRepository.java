package com.example.demo.repository;

import com.example.demo.model.ExamSession; // <-- FIXED
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamSessionRepository extends JpaRepository<ExamSession, Long> {
}
