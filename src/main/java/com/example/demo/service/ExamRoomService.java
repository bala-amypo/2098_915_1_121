package com.example.demo.service;

import java.util.List;
import com.example.demo.model.ExamSession;

public interface ExamRoomService {
    ExamSession save(ExamSession session);
    ExamSession getById(Long id);
    List<ExamSession> getAll();
}
