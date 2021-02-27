package com.veronicatee.employee_management_system.service;

import com.veronicatee.employee_management_system.model.Employee;
import com.veronicatee.employee_management_system.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

//    @Override
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public void saveEmployee(Employee employee) {
//        this.employeeRepository.save(employee);
//    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException("Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public Employee getEmployeeByName(String name) {
        Optional<Employee> optional = employeeRepository.findById(name);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException("Employee not found for id :: " + name);
        }
        return employee;
    }

    //    @Override
//    public void deleteEmployeeById(Long id) {
//        this.employeeRepository.deleteById(id);
//    }

    @Override
    public Employee login(String email, String password) {
        Optional<Employee> employee = employeeRepository.findByEmail(email);

        if (employee.isPresent()) {
            Employee loggedInEmployee = employee.get();
            if (loggedInEmployee.getPassword().equals(password)) return loggedInEmployee;
        }

        return null;
    }
}
