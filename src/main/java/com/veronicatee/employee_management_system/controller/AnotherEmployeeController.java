//package com.veronicatee.employee_management_system.controller;
//
//import com.veronicatee.employee_management_system.model.Employee;
//import com.veronicatee.employee_management_system.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//public class AnotherEmployeeController {
//
//    @Controller
//    public class EmployeeController {
//
//        @Autowired
//        private EmployeeService employeeService;
//
//
//        // Login
//
//        @PostMapping("/")
//        public String viewHomePage(Model model) {
////        model.addAttribute("username", );
//            return "index";
//        }
//
//
//        // Admin routes
//
//        // Display list of employees
//        @GetMapping("/allEmployees")
//        public String viewAllEmployeesPage(Model model) {
//            model.addAttribute("listEmployees", employeeService.getAllEmployees());
//            return "allEmployee";
//        }
//
//        @GetMapping("/newEmployeeForm")
//        public String newEmployeesForm(Model model) {
//            // Create method attribute to bind form data
//            Employee employee = new Employee();
//            model.addAttribute("employee", employee);
//            return "new_employee";
//        }
//
//        @PostMapping("/saveEmployee")
//        public String saveEmployee (@ModelAttribute("employee") Employee employee) {
//            // Save Employee to the database
//            employeeService.saveEmployee(employee);
//            return "redirect:/allEmployee";
//        }
//
//        @GetMapping("/updateForm/{id}")
//        public String updateForm (@PathVariable(value = "id") long id, Model model) {
//            //Get employee from the service
//            Employee employee = employeeService.getEmployeeById(id);
//
//            // Set employee as a model attribute to pre-populate the form
//            model.addAttribute("employee", employee);
//            return "update_employee";
//        }
//
//        @GetMapping("/deleteEmployee/{id}")
//        public String deleteEmployee (@PathVariable (value = "id") long id) {
//
//            // Call delete employee method
//            this.employeeService.deleteEmployeeById(id);
//            return "redirect:/allEmployee";
//        }
//
//
//        //User Routes
//
//        @GetMapping("/employeeProfile/{id}")
//        public String viewEmployeePage(@PathVariable (value = "id") long id, Model model) {
//            //Get employee from the service
//            Employee employee = employeeService.getEmployeeById(id);
//
//            // Set employee as a model attribute to pre-populate the form
//            model.addAttribute("employee", employee);
//            return "employee_home";
//        }
//
//        @PostMapping("/leaveDetails/{id}")
//        public String viewLeaveDetails (@PathVariable (value = "id") long id, Model model) {
//            //Get employee from the service
//            Employee employee = employeeService.getEmployeeById(id);
//
//
//            model.addAttribute("employee", employee);
//            return "employee_leave";
//        }
//
//
//    }
//}
