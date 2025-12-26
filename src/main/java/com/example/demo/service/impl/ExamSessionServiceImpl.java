package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.ExamSessionService;

public class ExamSessionServiceImpl implements ExamSessionService {

    public ExamSessionServiceImpl() {}

    public ExamSessionServiceImpl(ExamSessionRepository r,
                                  StudentRepository s) {}

    @Override
    public ExamSession createSession(ExamSession session) {
        return session;
    }

    @Override
    public ExamSession getSession(Long id) {
        return null;
    }
}
