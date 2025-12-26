package com.example.demo.service;

import com.example.demo.model.ExamRoom;
import java.util.List;

public interface ExamRoomService {

    ExamRoom save(ExamRoom room);     // ← matches repo.save()
    List<ExamRoom> findAll();
}
