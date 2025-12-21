package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SeatingPlan;

@Repository
public interface SeatingPlanRepository extends JpaRepository<SeatingPlan, Long> {

    // IMPORTANT: Id (capital I)
    List<SeatingPlan> findByExamSessionId(Long examSessionId);
}
