package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ExamRoom;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.service.ExamRoomService;

@Service
public class ExamRoomServiceImpl implements ExamRoomService {

    private final ExamRoomRepository examRoomRepository;

    public ExamRoomServiceImpl(ExamRoomRepository examRoomRepository) {
        this.examRoomRepository = examRoomRepository;
    }

    @Override
    public ExamRoom save(ExamRoom room) {
        return examRoomRepository.save(room);
    }

    @Override
    public ExamRoom getById(Long id) {
        return examRoomRepository.findById(id).orElse(null);
    }

    @Override
    public List<ExamRoom> getAll() {
        return examRoomRepository.findAll();
    }
}
