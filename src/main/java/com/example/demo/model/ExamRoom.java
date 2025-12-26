package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exam_room")
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String roomNumber;

    @Column(name = "row_count", nullable = false)   // ✅ FIX
    private int rows;

    @Column(name = "col_count", nullable = false)   // ✅ SAFE NAME
    private int columns;

    @Column(nullable = false)
    private int capacity;

    public ExamRoom() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public int getRows() { return rows; }
    public void setRows(int rows) { this.rows = rows; }

    public int getColumns() { return columns; }
    public void setColumns(int columns) { this.columns = columns; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public void ensureCapacityMatches() {
        this.capacity = this.rows * this.columns;
    }
}
