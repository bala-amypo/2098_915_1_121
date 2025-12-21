package com.example.demo.repository;
import org.springframework.stereotype.Repository;


import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.SeatingPlan;


@Repository
public interface SeatingPlanRepository extends JpaRepository<SeatingPlan, Long> {
List<SeatingPlan> findByExamSessionId(Long examSessionId);
}