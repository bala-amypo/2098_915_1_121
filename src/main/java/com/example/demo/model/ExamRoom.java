package com.example.demo.model;


import jakarta.persistence.*;


@Entity
@Table(name = "exam_rooms", uniqueConstraints = @UniqueConstraint(columnNames = "roomNumber"))
public class ExamRoom {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String roomNumber;
@Column(name = "room_rows")
private int rows;

@Column(name = "room_columns")
private int columns;

private Integer capacity;


public ExamRoom() {}


public ExamRoom(String roomNumber, Integer rows, Integer columns) {
this.roomNumber = roomNumber;
this.rows = rows;
this.columns = columns;
ensureCapacityMatches();
}


@PrePersist
@PreUpdate
public void ensureCapacityMatches() {
this.capacity = this.rows * this.columns;
}


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