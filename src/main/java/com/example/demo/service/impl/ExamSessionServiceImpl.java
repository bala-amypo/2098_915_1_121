package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // 🔥 VERY IMPORTANT
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository repository;

    // Default constructor (needed for Spring)
    public ExamSessionServiceImpl() {
        this.repository = null;
    }

    // Constructor used in tests
    public ExamSessionServiceImpl(ExamSessionRepository repository) {
        this.repository = repository;
    }

    @Override
    public ExamSession createSession(ExamSession session) {
        return repository.save(session);
    }

    @Override
    public ExamSession getSession(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ExamSession> getAllSessions() {
        return repository.findAll();
    }
}
