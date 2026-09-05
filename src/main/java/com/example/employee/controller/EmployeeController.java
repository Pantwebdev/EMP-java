package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("employees", service.getAll());
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping("/employees")
    public String add(@ModelAttribute Employee employee) {
        service.save(employee);
        return "redirect:/";
    }

    @GetMapping("/employees/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }

    @GetMapping("/employees/search")
    public String search(@RequestParam String name, Model model) {
        model.addAttribute("employees", service.search(name));
        model.addAttribute("employee", new Employee());
        return "index";
    }
}
