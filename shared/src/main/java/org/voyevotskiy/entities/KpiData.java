package org.voyevotskiy.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class KpiData implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private int employeeId;
    private int periodMonth;
    private int periodYear;
    private double kpiScore;
    private BigDecimal bonusAmount;

    public KpiData() {
    }

    public KpiData(int id, int employeeId, int periodMonth, int periodYear,
                   double kpiScore, BigDecimal bonusAmount) {
        this.id = id;
        this.employeeId = employeeId;
        this.periodMonth = periodMonth;
        this.periodYear = periodYear;
        this.kpiScore = kpiScore;
        this.bonusAmount = bonusAmount;
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
    public int getPeriodMonth() {
        return periodMonth;
    }
    public void setPeriodMonth(int periodMonth) {
        this.periodMonth = periodMonth;
    }
    public int getPeriodYear() {
        return periodYear;
    }
    public void setPeriodYear(int periodYear) {
        this.periodYear = periodYear;
    }
    public double getKpiScore() {
        return kpiScore;
    }
    public void setKpiScore(double kpiScore) {
        this.kpiScore = kpiScore;
    }
    public BigDecimal getBonusAmount() {
        return bonusAmount;
    }
    public void setBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
}