package com.example.demo.service;

import java.util.List;
import com.example.demo.model.ExamRoom;

public interface ExamRoomService {
    ExamRoom save(ExamRoom session);
    ExamRoom getById(Long id);
    List<ExamRoom> getAll();
}
