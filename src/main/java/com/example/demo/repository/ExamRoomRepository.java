package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ExamSession;

public interface ExamRoomRepository extends JpaRepository<ExamRoom, Long> {

    Optional<ExamRoom> findByCourseCode(String courseCode);
}
