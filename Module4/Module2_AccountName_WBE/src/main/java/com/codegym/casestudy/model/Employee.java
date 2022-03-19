package com.codegym.casestudy.model;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    private int employeeId;
    private String employeeName;
    private String employeeBirthday;
    private String employeeIdCard;
    private double employeeSalary;
    private String employeePhone;
    private String employeeEmail;
    private String employeeAddress;

    private int positionId;
    private int educationDegreeId;
    private int divisionId;

    private String user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_position", referencedColumnName = "positionId")
    private Position position;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_educationDegree", referencedColumnName = "educationDegreeId")
    private EducationDegree educationDegree;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_division", referencedColumnName = "divisionId")
    private Division division;

    public Employee() {
    }

}
