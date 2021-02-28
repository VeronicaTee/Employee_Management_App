package com.veronicatee.employee_management_system.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    public long employee_id;

    @Column
    public long sign_in;

    @Column
    public long sign_out;


}
