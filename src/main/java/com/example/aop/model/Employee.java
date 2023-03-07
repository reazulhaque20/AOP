package com.example.aop.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private Long employeeNo;
    private String employeeName;
    private String employeeEmail;
    private String employeeMobile;
    private String employeeAddress;
}
