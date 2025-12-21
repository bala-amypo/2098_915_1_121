package com.example.demo.repository;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.ExamSession;


@Repository
public interface ExamSessionRepository extends JpaRepository<ExamSession, Long> {
List<ExamSession> findByExamDate(LocalDate date);
}