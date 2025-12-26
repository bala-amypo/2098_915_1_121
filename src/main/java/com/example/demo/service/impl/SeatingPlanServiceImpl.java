package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final SeatingPlanRepository repo;

    public SeatingPlanServiceImpl(SeatingPlanRepository repo) {
        this.repo = repo;
    }

    @Override
    public SeatingPlan generatePlan(Long sessionId) {
        SeatingPlan plan = new SeatingPlan();
        return repo.save(plan);
    }

    @Override
    public SeatingPlan getPlan(Long sessionId) {
        return repo.findAll().stream().findFirst().orElse(null);
    }

    @Override
    public List<SeatingPlan> getPlansBySession(Long sessionId) {
        return repo.findAll();
    }
}
