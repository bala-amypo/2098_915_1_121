package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.SeatingPlan;

@Service
public class SeatingPlanService {

    private List<SeatingPlan> seatingPlans = new ArrayList<>();
    private Long idCounter = 1L;

    public SeatingPlan createSeatingPlan(SeatingPlan plan) {
        plan.setId(idCounter++);
        seatingPlans.add(plan);
        return plan;
    }

    public List<SeatingPlan> getByExamId(Long examId) {
        List<SeatingPlan> result = new ArrayList<>();
        for (SeatingPlan plan : seatingPlans) {
            if (plan.getExamId().equals(examId)) {
                result.add(plan);
            }
        }
        return result;
    }
}
