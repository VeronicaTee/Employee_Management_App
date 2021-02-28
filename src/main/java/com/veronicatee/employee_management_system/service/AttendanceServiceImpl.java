package com.veronicatee.employee_management_system.service;

import com.veronicatee.employee_management_system.model.Attendance;
import com.veronicatee.employee_management_system.model.Employee;
import com.veronicatee.employee_management_system.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;


    @Override
    public void addAttendance(Employee employee) {

    }

    @Override
    public List<Attendance> getAttendanceByEmployeeId(Employee employee) {
        return null;
    }

    @Override
    public List<Attendance> findAllDailyAttendance() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String date = localDateTime.toString().split("T")[0];
        String time = localDateTime.toString().split("T")[1];
        String hour = time.split(":")[0];
        String newStartTime = hour.replace(hour,"00:00:00.000");
        String newEndTime = hour.replace(hour,"23:59:59.999");
        String newStartDate = date+"T"+newStartTime;
        String newEndDate = date+"T"+newEndTime;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
        LocalDateTime localStartDate = LocalDateTime.parse(newStartDate, dateTimeFormatter);
        LocalDateTime localEndDate = LocalDateTime.parse(newEndDate, dateTimeFormatter);
        return attendanceRepository.findAllByTimeAppliedBetween(localStartDate, localEndDate);
    }





}
