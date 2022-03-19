package com.codegym.casestudy.model;

import javax.persistence.*;

@Entity
public class Division {

    @Id
    private int divisionId;
    private String divisionName;

    public Division(int divisionId) {
        this.divisionId = divisionId;
    }

    public Division(int divisionId, String divisionName) {
        this.divisionId = divisionId;
        this.divisionName = divisionName;
    }

    public int getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }
}

