package com.veronicatee.employee_management_system.controller;

import com.veronicatee.employee_management_system.model.Employee;
import com.veronicatee.employee_management_system.service.AdminService;
import com.veronicatee.employee_management_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
//    private EmployeeService employeeService;
    private AdminService adminService;

    // Admin routes

    // Display list of employees
    @GetMapping("/allEmployees")
    public String viewAllEmployeesPage(Model model) {
        model.addAttribute("listEmployees", adminService.getAllEmployees());
        return "allEmployee";
    }

    @GetMapping("/newEmployeeForm")
    public String newEmployeesForm(Model model) {
        // Create method attribute to bind form data
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee (@ModelAttribute("employee") Employee employee) {
        // Save Employee to the database
        adminService.saveEmployee(employee);
        return "redirect:/admin/allEmployees";
    }

    @GetMapping("/employeeProfile/{id}")
    public String viewEmployeePage(@PathVariable (value = "id") long id, Model model) {
        //Get employee from the service
        Employee employee = adminService.getEmployeeById(id);

        // Set employee as a model attribute to pre-populate the form
        model.addAttribute("employee", employee);
        return "employee_profile";
    }
//    @GetMapping("/employeeProfile/{name}")
//    public String viewEmployee(@PathVariable (value = "fullName") String name, Model model) {
//        //Get employee from the service
//        Employee employee = adminService.getEmployeeByName(name);
//
//        // Set employee as a model attribute to pre-populate the form
//        model.addAttribute("employee", employee);
//        return "employee_home";
//    }

    @GetMapping("/updateForm/{id}")
    public String updateForm (@PathVariable(value = "id") long id, Model model) {
        //Get employee from the service
        Employee employee = adminService.getEmployeeById(id);

        // Set employee as a model attribute to pre-populate the form
        model.addAttribute("employee", employee);
        return "update_employee";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee (@PathVariable (value = "id") long id) {

        // Call delete employee method
        this.adminService.deleteEmployeeById(id);
        return "redirect:/admin/allEmployees";
    }


}
