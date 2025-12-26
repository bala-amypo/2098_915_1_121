package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exam_room")
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String roomNumber;

    @Column(name = "row_count", nullable = false)
    private Integer rows;

    @Column(name = "col_count", nullable = false)
    private Integer columns;

    @Column(nullable = false)
    private Integer capacity;

    public ExamRoom() {}

    // ===== GETTERS / SETTERS =====

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

    // 🔥 REQUIRED BY TESTS
    public void ensureCapacityMatches() {
        if (rows != null && columns != null) {
            this.capacity = rows * columns;
        }
    }

    // ===== BUILDER (TESTS DEPEND ON THIS) =====

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final ExamRoom r = new ExamRoom();

        public Builder id(Long id) {
            r.setId(id);
            return this;
        }

        public Builder roomNumber(String roomNumber) {
            r.setRoomNumber(roomNumber);
            return this;
        }

        public Builder rows(Integer rows) {
            r.setRows(rows);
            return this;
        }

        public Builder columns(Integer columns) {
            r.setColumns(columns);
            return this;
        }

        public Builder capacity(Integer capacity) {
            r.setCapacity(capacity);
            return this;
        }

        public ExamRoom build() {
            return r;
        }
    }
}
