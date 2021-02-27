package com.veronicatee.employee_management_system.controller;

import com.veronicatee.employee_management_system.model.Employee;
import com.veronicatee.employee_management_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LeaveController {

    @Autowired
    private EmployeeService employeeService;

//    @PostMapping("/leaveDetails")
//    public String leaveApplication (@PathVariable(value = "id") long id, Model model) {
//        //Get employee from the service
//        Employee employee = employeeService.getEmployeeById(id);
//
//
//        model.addAttribute("employee", employee);
//        return "apply_leave";
//    }
}
