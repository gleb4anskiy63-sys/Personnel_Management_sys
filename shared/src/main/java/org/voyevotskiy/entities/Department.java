package org.voyevotskiy.entities;

import java.io.Serializable;

public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String description;
    private int employeesId;

    public Department() {
    }
    public Department(int id, String name, String description, int employeesId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employeesId = employeesId;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getEmployeesId() {
        return employeesId;
    }
    public void setEmployeesId(int employeesId) {
        this.employeesId = employeesId;
    }
}