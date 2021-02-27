package com.veronicatee.employee_management_system.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "leave")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String leaveType;

    @Column
    private String leaveReason;

    @Column
    private LocalDate fromDate;

    @Column
    private long employeeId;

    @Column
    private LocalDate toDate;

    @Column
    private String deniedReason;

    @Column
    private String status;

    @Column
    private LocalDateTime createdAt;

    @Column
    private String reviewedBy;


}
