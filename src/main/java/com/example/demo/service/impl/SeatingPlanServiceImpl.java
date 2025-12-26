package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private ExamSessionRepository sessionRepo;
    private SeatingPlanRepository planRepo;
    private ExamRoomRepository roomRepo;

    // REQUIRED
    public SeatingPlanServiceImpl() {}

    // REQUIRED BY TESTS
    public SeatingPlanServiceImpl(ExamSessionRepository sessionRepo,
                                  SeatingPlanRepository planRepo,
                                  ExamRoomRepository roomRepo) {
        this.sessionRepo = sessionRepo;
        this.planRepo = planRepo;
        this.roomRepo = roomRepo;
    }

    @Override
    public SeatingPlan generatePlan(Long sessionId) {
        SeatingPlan plan = new SeatingPlan();
        plan.setSessionId(sessionId);
        return planRepo.save(plan);
    }

    @Override
    public SeatingPlan getPlan(Long sessionId) {
        return planRepo.findByExamSessionId(sessionId)
                .stream().findFirst().orElse(null);
    }

    @Override
    public List<SeatingPlan> getPlansBySession(Long sessionId) {
        return planRepo.findByExamSessionId(sessionId);
    }
}
