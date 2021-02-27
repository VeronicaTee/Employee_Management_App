package com.veronicatee.employee_management_system.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class LeaveDto {
    private Long leaveId;

//    private EmployeeDTO employeeDTO;

//    private LeaveTypeDTO leaveTypeDTO;

    private String leaveReason;

    private LocalDate fromDate;

    private LocalDate toDate;

    private String deniedReason;

    private String status;

    private LocalDateTime createdAt;

//    private EmployeeDTO reviewedBy;

    public Long getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Long leaveId) {
        this.leaveId = leaveId;
    }


}
