package com.veronicatee.employee_management_system.repository;

import com.veronicatee.employee_management_system.model.Attendance;
import com.veronicatee.employee_management_system.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    Optional<Attendance> findByEmployeeAndTimeAppliedIsBetween(Employee employee, LocalDateTime start, LocalDateTime end);
    List<Attendance> findAllByTimeAppliedBetween(LocalDateTime start, LocalDateTime end);
    List<Attendance> findAllByEmployee(Employee employee);
}


