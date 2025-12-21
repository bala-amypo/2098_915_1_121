package com.example.demo.model;

import jakarta.persistence.*;
import com.example.demo.exception.ApiException;

@Entity
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String roomNumber;

    private Integer rows;
    private Integer columns;
    private Integer capacity;

    @PrePersist
    @PreUpdate
    public void ensureCapacityMatches() {
        if (rows == null || columns == null || capacity == null) {
            throw new ApiException("capacity invalid");
        }

        if (rows * columns != capacity) {
            throw new ApiException("capacity mismatch");
        }
    }

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public Integer getRows() { return rows; }
    public void setRows(Integer rows) { this.rows = rows; }

    public Integer getColumns() { return columns; }
    public void setColumns(Integer columns) { this.columns = columns; }

    public Integer getCapacity() { return capacity; }
    public void setCapacity(Integer capacity) { this.capacity = capacity; }
}
