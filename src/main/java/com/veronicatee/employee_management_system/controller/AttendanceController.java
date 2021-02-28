package com.veronicatee.employee_management_system.controller;


import com.veronicatee.employee_management_system.model.Employee;
import com.veronicatee.employee_management_system.service.AdminService;
import com.veronicatee.employee_management_system.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class AttendanceController {


    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("employee/attendance")
    public String viewAllAttendance(Model model, Employee employee) {
        model.addAttribute("listEmployees", attendanceService.getAttendanceByEmployeeId(employee));
        return "attendance";
    }

}
