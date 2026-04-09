package org.voyevotskiy.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private int userId;
    private int departmentId;
    private String position;
    private Date hireDate;
    private BigDecimal salaryBase;
    private int timeTrackingId;
    private int kpiDataId;
    private int attestationsId;

    public Employee() {
    }
    public Employee(int id, int userId, int departmentId, String position, Date hireDate, BigDecimal salaryBase, int timeTrackingId,
                    int kpiDataId, int attestationsId) {
        this.id = id;
        this.userId = userId;
        this.departmentId = departmentId;
        this.position = position;
        this.hireDate = hireDate;
        this.salaryBase = salaryBase;
        this.timeTrackingId = timeTrackingId;
        this.kpiDataId = kpiDataId;
        this.attestationsId = attestationsId;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public BigDecimal getSalaryBase() {
        return salaryBase;
    }
    public void setSalaryBase(BigDecimal salaryBase) {
        this.salaryBase = salaryBase;
    }
    public int getTimeTrackingId() {
        return timeTrackingId;
    }
    public void setTimeTrackingId(int timeTrackingId) {
        this.timeTrackingId = timeTrackingId;
    }

    public int getKpiDataId() {
        return kpiDataId;
    }

    public void setKpiDataId(int kpiDataId) {
        this.kpiDataId = kpiDataId;
    }
    public int getAttestationsId() {
        return attestationsId;
    }
    public void setAttestationsId(int attestationsId) {
        this.attestationsId = attestationsId;
    }
}