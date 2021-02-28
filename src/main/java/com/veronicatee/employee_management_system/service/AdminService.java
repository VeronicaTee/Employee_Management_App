package com.veronicatee.employee_management_system.service;

import com.veronicatee.employee_management_system.model.Employee;

import java.util.List;

public interface AdminService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee getEmployeeByName(String name);
    void deleteEmployeeById(Long id);

    Employee login(String email, String password);
}
