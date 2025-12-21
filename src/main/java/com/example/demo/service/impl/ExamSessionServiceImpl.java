package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository examSessionRepository;

    public ExamSessionServiceImpl(ExamSessionRepository examSessionRepository) {
        this.examSessionRepository = examSessionRepository;
    }

    @Override
    public ExamSession save(ExamSession session) {
        return examSessionRepository.save(session);
    }

    @Override
    public ExamSession getById(Long id) {
        return examSessionRepository.findById(id).orElse(null);
    }

    @Override
    public List<ExamSession> getAll() {
        return examSessionRepository.findAll();
    }
}
