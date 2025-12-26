package com.example.demo.service;

import com.example.demo.entity.SeatingPlan;

public interface SeatingPlanService {

    SeatingPlan generatePlan(Long sessionId, Long roomId);
}
