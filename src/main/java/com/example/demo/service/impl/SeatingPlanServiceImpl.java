package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    @Autowired
    private SeatingPlanRepository seatingPlanRepository;

    @Override
    public SeatingPlan generatePlan(Long sessionId) {
        SeatingPlan plan = new SeatingPlan();
        plan.setSessionId(sessionId);
        return seatingPlanRepository.save(plan);
    }

    @Override
    public SeatingPlan getPlan(Long planId) {
        return seatingPlanRepository.findById(planId).orElse(null);
    }

    @Override
    public List<SeatingPlan> getPlansBySession(Long sessionId) {
        return seatingPlanRepository.findBySessionId(sessionId);
    }
}
