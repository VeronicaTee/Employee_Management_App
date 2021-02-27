package com.veronicatee.employee_management_system.controller;

import com.veronicatee.employee_management_system.dto.LoginDto;
import com.veronicatee.employee_management_system.model.Employee;
import com.veronicatee.employee_management_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String viewHomePage() {
        return "index_2";
    }


    // Login
    @GetMapping("/login")
    public String login(@ModelAttribute("employee") Employee employee) {

        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@ModelAttribute("loginDto") LoginDto loginDto, Model model, HttpSession session) {
        Employee employee = employeeService.login(loginDto.getEmail(), loginDto.getPassword());
        if (employee == null) {
            model.addAttribute("error", "incorrect username or password");
            return "login";
        }

        session.setAttribute("principal", employee);

        if (employee.getRole().equals("Admin")) {
//            session.setAttribute("admin", employee);
            return "/admin/allEmployees";
        }
        return "allEmployee";
//        /employeeProfile/{id}(id=${employee.id})
    }


//    public String login (HttpSession session, Admin admin, Model model, Employee employee) {
//        Admin onlyAdmin = adminService.login(admin.getEmail(), admin.getPassword());
//        Employee onlyEmployee = employeeService.login(employee.getEmail(), employee.getPassword());
//        if (onlyAdmin == null && onlyEmployee == null) {
//            //error message if email does not exist in database
//            model.addAttribute("invalid", "User does not exist. Check login details or register.");
//            //  model.addAttribute("invalid", "Admin does not exist. Check login details or register.");
//            return "login";
//        } else if (onlyAdmin != null) {
//            session.setAttribute("admin", onlyAdmin);
////            return "redirect:/employee"
////            System.out.println("hello");
//            return "redirect:/testing";
//        }else {
//            model.addAttribute("name", onlyEmployee.getFirstName());
//            session.setAttribute("employee", onlyEmployee);
//            return "employee-dashboard";
//        }
//
//    }



    // Login form with error
    @GetMapping("/login-error")
    public String loginError(@PathVariable(value = "email") String email, Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }
}
