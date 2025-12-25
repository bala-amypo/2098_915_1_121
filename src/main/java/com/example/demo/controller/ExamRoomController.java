package com.example.demo.controller;

import com.example.demo.model.ExamRoom;
import com.example.demo.service.ExamRoomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class ExamRoomController {

    private final ExamRoomService service;

    public ExamRoomController(ExamRoomService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ExamRoom> add(@RequestBody ExamRoom room) {
        return ResponseEntity.ok(service.addRoom(room));
    }

    @GetMapping
    public ResponseEntity<List<ExamRoom>> getAll() {
        return ResponseEntity.ok(service.getAllRooms());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExamRoom> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getRoomById(id));
    }
}
