package com.codegym.casestudy.model;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    private int positionId;

    private String positionName;

    @OneToOne(mappedBy = "position")
    private Employee employee;

    public Position() {
    }

}
