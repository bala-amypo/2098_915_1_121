package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final SeatingPlanRepository repository;

    public SeatingPlanServiceImpl(SeatingPlanRepository repository) {
        this.repository = repository;
    }

    @Override
    public SeatingPlan save(SeatingPlan seatingPlan) {
        return repository.save(seatingPlan);
    }
}
