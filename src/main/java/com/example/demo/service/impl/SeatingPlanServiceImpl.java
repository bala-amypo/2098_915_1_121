package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ExamRoom;
import com.example.demo.model.ExamSession;
import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final SeatingPlanRepository seatingPlanRepository;
    private final ExamSessionRepository examSessionRepository;
    private final ExamRoomRepository examRoomRepository;

    public SeatingPlanServiceImpl(SeatingPlanRepository seatingPlanRepository,
                                  ExamSessionRepository examSessionRepository,
                                  ExamRoomRepository examRoomRepository) {
        this.seatingPlanRepository = seatingPlanRepository;
        this.examSessionRepository = examSessionRepository;
        this.examRoomRepository = examRoomRepository;
    }

    @Override
    public SeatingPlan generate(Long sessionId, Long roomId) {
        ExamSession session = examSessionRepository.findById(sessionId).orElse(null);
        ExamRoom room = examRoomRepository.findById(roomId).orElse(null);

        if (session == null || room == null) {
            return null;
        }

        return seatingPlanRepository
                .findByExamSessionAndExamRoom(session, room)
                .orElseGet(() -> {
                    SeatingPlan plan = new SeatingPlan();
                    plan.setExamSession(session);
                    plan.setExamRoom(room);
                    return seatingPlanRepository.save(plan);
                });
    }

    @Override
    public SeatingPlan getById(Long id) {
        return seatingPlanRepository.findById(id).orElse(null);
    }

    @Override
    public List<SeatingPlan> getBySession(Long sessionId) {
        ExamSession session = examSessionRepository.findById(sessionId).orElse(null);
        if (session == null) {
            return List.of();
        }
        return seatingPlanRepository.findByExamSession(session);
    }
}
