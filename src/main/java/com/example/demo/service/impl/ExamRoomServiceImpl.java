package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.ExamRoom;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.service.ExamRoomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamRoomServiceImpl implements ExamRoomService {

    private final ExamRoomRepository repository;

    public ExamRoomServiceImpl(ExamRoomRepository repository) {
        this.repository = repository;
    }

    public ExamRoom addRoom(ExamRoom room) {
        if (repository.existsByRoomNumber(room.getRoomNumber())) {
            throw new ApiException("exists", 409);
        }
        return repository.save(room);
    }

    public List<ExamRoom> getAllRooms() {
        return repository.findAll();
    }

    public ExamRoom getRoomById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ApiException("no room", 404));
    }
}
