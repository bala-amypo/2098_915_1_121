package com.example.demo.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.ExamRoom;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.service.ExamRoomService;

@Service
public class ExamRoomServiceImpl implements ExamRoomService {

    private final ExamRoomRepository repo;

    public ExamRoomServiceImpl(ExamRoomRepository repo) {
        this.repo = repo;
    }

    @Override
    public ExamRoom addRoom(ExamRoom room) {
        return repo.save(room);
    }

    @Override
    public List<ExamRoom> getAllRooms() {
        return repo.findAll();
    }
}
