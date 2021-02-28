package com.veronicatee.employee_management_system.service;

import com.veronicatee.employee_management_system.model.Attendance;
import com.veronicatee.employee_management_system.model.Employee;

import java.util.List;

public interface AttendanceService {
    void addAttendance(Employee employee);
    List<Attendance> findAllDailyAttendance();
    List<Attendance> getAttendanceByEmployeeId(Employee employee);

}

//public interface AdminService {
//    List<Employee> getAllEmployees();
//    void saveEmployee(Employee employee);
//    Employee getEmployeeById(Long id);
//    Employee getEmployeeByName(String name);
//    void deleteEmployeeById(Long id);
////    Employee getEmployeeByEmail(String email);
//
//    Employee login(String email, String password);
//}