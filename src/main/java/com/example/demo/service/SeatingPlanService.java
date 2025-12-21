package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SeatingPlan;

public interface SeatingPlanService {

    List<SeatingPlan> getSeatingPlanByExamSession(Long examSessionId);
}
