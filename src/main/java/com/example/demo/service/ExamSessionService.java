package com.example.demo.service;

import com.example.demo.model.ExamSession;
import java.util.List;

public interface ExamSessionService {

    List<ExamSession> getAllSessions();

    ExamSession getSession(Long id);   // used for GET by ID

    void saveSession(ExamSession session);  // used for CREATE/UPDATE

    void deleteSession(Long id);
}
