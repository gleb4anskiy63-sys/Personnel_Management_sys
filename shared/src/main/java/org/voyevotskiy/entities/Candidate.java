package org.voyevotskiy.entities;

import java.io.Serializable;

public class Candidate implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String fio;
    private String email;
    private String securityStatus;
    private String cvText;

    public Candidate() {
    }
    public Candidate(int id, String fio, String email, String securityStatus, String cvText) {
        this.id = id;
        this.fio = fio;
        this.email = email;
        this.securityStatus = securityStatus;
        this.cvText = cvText;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSecurityStatus() {
        return securityStatus;
    }
    public void setSecurityStatus(String securityStatus) {
        this.securityStatus = securityStatus;
    }
    public String getCvText() {
        return cvText;
    }
    public void setCvText(String cvText) {
        this.cvText = cvText;
    }
}