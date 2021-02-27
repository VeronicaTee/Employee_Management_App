package com.veronicatee.employee_management_system.repository;

import com.veronicatee.employee_management_system.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository<Email> extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
}
