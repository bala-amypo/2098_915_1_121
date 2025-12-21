package com.example.demo.service;


import java.util.*;
import com.example.demo.model.ExamRoom;


public interface ExamRoomService {
ExamRoom addRoom(ExamRoom room);
List<ExamRoom> getAllRooms();
}