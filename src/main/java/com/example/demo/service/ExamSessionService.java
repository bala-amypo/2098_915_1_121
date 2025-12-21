package com.example.demo.service;

import com.example.demo.model.ExamSession;
import java.util.List;

public interface ExamSessionService {

    List<ExamSession> getAllSessions();

    ExamSession getSession(Long id);  // MUST match in Impl

    void saveSession(ExamSession session);

    void deleteSession(Long id);
}
