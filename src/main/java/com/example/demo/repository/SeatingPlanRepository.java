package com.example.demo.repository;


import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.SeatingPlan;


@Repository
public interface SeatingPlanRepository extends JpaRepository<SeatingPlan, Long> {
List<SeatingPlan> findByExamSessionld(Long sessionld);
}