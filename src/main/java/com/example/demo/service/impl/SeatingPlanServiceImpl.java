package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service   // 🔥 REQUIRED — without this Spring cannot find the bean
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final SeatingPlanRepository repository;

    public SeatingPlanServiceImpl(SeatingPlanRepository repository) {
        this.repository = repository;
    }

    @Override
    public SeatingPlan generatePlan(Long sessionId) {
        SeatingPlan plan = new SeatingPlan();
        plan.setSessionId(sessionId);
        plan.setGeneratedAt(LocalDateTime.now());
        plan.setArrangementJson("{}");
        return repository.save(plan);
    }

    @Override
    public SeatingPlan getPlan(Long sessionId) {
        return repository.findBySessionId(sessionId);
    }

    @Override
    public List<SeatingPlan> getAllPlans() {
        return repository.findAll();
    }
}
