package com.veronicatee.employee_management_system.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String fullName;

    @Column
    private String userName;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private long phoneNumber;

    @Column
    private String role;

    @Column
    private long salary;

    @Column
    private String status;

    @Column
    private String supervisor;



}
