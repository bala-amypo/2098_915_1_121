package com.example.demo.repository;


import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.ExamRoom;


@Repository
public interface ExamRoomRepository extends JpaRepository<ExamRoom, Long> {
Optional<ExamRoom> findByRoomNumber(String roomNumber);
List<ExamRoom> findByCapacityGreaterThanEqual(Integer capacity);
}