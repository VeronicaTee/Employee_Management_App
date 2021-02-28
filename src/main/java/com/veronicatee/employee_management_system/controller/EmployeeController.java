package com.veronicatee.employee_management_system.controller;

import com.veronicatee.employee_management_system.dto.LoginDto;
import com.veronicatee.employee_management_system.model.Employee;
import com.veronicatee.employee_management_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    //User Routes
//
//    @GetMapping("/employeeProfile/{id}")
//    public String viewEmployeePage(@PathVariable (value = "id") long id, Model model) {
//        //Get employee from the service
//        Employee employee = employeeService.getEmployeeById(id);
//
//        // Set employee as a model attribute to pre-populate the form
//        model.addAttribute("employee", employee);
//        return "employee_home";
//    }

    @GetMapping("/employeeProfile")
    public String viewEmployeePage(Model model, HttpSession session) {

        Object userobj = session.getAttribute("employee");
        if (userobj == null) return "redirect:/";

        model.addAttribute("employee", new Employee());
        return "employee_home";
    }

    @GetMapping ("/leaveApplication")
//    public String viewLeaveDetails (@PathVariable (value = "id") long id, Model model) {
    public String viewLeaveDetails (Model model) {
//        //Get employee from the service
//        Employee employee = employeeService.getEmployeeById(id);
//
//
//        model.addAttribute("employee", employee);
        return "apply_leave";
    }


}
