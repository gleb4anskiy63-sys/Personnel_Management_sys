package org.voyevotskiy.entities;

import java.io.Serializable;
import java.util.Date;

public class TimeTracking implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private int employeeId;
    private Date workDate;
    private double hoursCount;
    private double overtimeHours;

    public TimeTracking() {
    }
    public TimeTracking(int id, int employeeId, Date workDate,
                        double hoursCount, double overtimeHours) {
        this.id = id;
        this.employeeId = employeeId;
        this.workDate = workDate;
        this.hoursCount = hoursCount;
        this.overtimeHours = overtimeHours;
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
    public Date getWorkDate() {
        return workDate;
    }
    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }
    public double getHoursCount() {
        return hoursCount;
    }
    public void setHoursCount(double hoursCount) {
        this.hoursCount = hoursCount;
    }
    public double getOvertimeHours() {
        return overtimeHours;
    }
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}