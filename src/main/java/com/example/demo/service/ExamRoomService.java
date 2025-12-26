package com.example.demo.service;

import com.example.demo.model.ExamRoom;
import java.util.List;

public interface ExamRoomService {

    ExamRoom addRoom(ExamRoom room);     // ← controller expects this
    List<ExamRoom> getAllRooms();        // ← controller expects this
}
