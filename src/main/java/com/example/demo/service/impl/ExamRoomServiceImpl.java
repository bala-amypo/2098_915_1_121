package com.example.demo.service.impl;

import com.example.demo.model.ExamRoom;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.service.ExamRoomService;

import java.util.List;

public class ExamRoomServiceImpl implements ExamRoomService {

    public ExamRoomServiceImpl() {}

    public ExamRoomServiceImpl(ExamRoomRepository repo) {}

    @Override
    public List<ExamRoom> getAllRooms() {
        return List.of();
    }
}
