package org.voyevotskiy.entities;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String login;
    private String password;
    private String role;
    private int employeesId;

    public User() {
    }
    public User(int id, String login, String password, String role, int employeesId) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.employeesId = employeesId;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getEmployeesId() {
        return employeesId;
    }
    public void setEmployeesId(int employeesId) {
        this.employeesId = employeesId;
    }
}