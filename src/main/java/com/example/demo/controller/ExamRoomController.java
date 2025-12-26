package com.example.demo.controller;

import com.example.demo.model.ExamRoom;
import com.example.demo.service.ExamRoomService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ExamRoomController {

    private ExamRoomService service;

    // ✅ REQUIRED
    public ExamRoomController() {}

    // ✅ REQUIRED
    public ExamRoomController(ExamRoomService service) {
        this.service = service;
    }

    public ResponseEntity<ExamRoom> add(ExamRoom room) {
        return ResponseEntity.ok(service.addRoom(room));
    }

    public ResponseEntity<List<ExamRoom>> list() {
        return ResponseEntity.ok(service.getAllRooms());
    }
}
