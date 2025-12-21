package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository examSessionRepository;

    // Constructor injection
    public ExamSessionServiceImpl(ExamSessionRepository examSessionRepository) {
        this.examSessionRepository = examSessionRepository;
    }

    @Override
    public List<ExamSession> getAllSessions() {
        return examSessionRepository.findAll();
    }

    @Override
    public ExamSession getSession(Long id) {   // MATCHES INTERFACE
        return examSessionRepository.findById(id).orElse(null);
    }

    @Override
    public void saveSession(ExamSession session) {
        examSessionRepository.save(session);
    }

    @Override
    public void deleteSession(Long id) {
        examSessionRepository.deleteById(id);
    }
}
