package org.voyevotskiy.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Attestations implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private int employeeId;
    private LocalDate attendanceDate;
    private int resultScore;
    private boolean isCompliant;

    public Attestations() {
    }
    public Attestations(int id, int employeeId, LocalDate attendanceDate, int resultScore, boolean isCompliant) {
        this.id = id;
        this.employeeId = employeeId;
        this.attendanceDate = attendanceDate;
        this.resultScore = resultScore;
        this.isCompliant = isCompliant;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }
    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }
    public int getResultScore() {
        return resultScore;
    }
    public void setResultScore(int resultScore) {
        this.resultScore = resultScore;
    }
    public boolean isCompliant() {
        return isCompliant;
    }
    public void setCompliant(boolean isCompliant) {
        this.isCompliant = isCompliant;
    }
}