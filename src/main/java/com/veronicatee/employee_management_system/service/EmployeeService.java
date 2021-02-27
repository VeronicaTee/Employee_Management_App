package com.veronicatee.employee_management_system.service;

import com.veronicatee.employee_management_system.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeById(Long id);
    Employee getEmployeeByName(String name);
    Employee login(String email, String password);

}
