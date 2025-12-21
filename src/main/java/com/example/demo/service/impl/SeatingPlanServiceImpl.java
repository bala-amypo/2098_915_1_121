package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final SeatingPlanRepository seatingPlanRepository;

    // ✅ Constructor Injection (NO @Autowired)
    public SeatingPlanServiceImpl(SeatingPlanRepository seatingPlanRepository) {
        this.seatingPlanRepository = seatingPlanRepository;
    }

    @Override
    public List<SeatingPlan> getSeatingPlanByExamSession(Long examSessionId) {
        return seatingPlanRepository.findByExamSessionId(examSessionId);
    }
}
