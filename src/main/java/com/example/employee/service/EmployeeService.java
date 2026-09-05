package com.example.employee.service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public List<Employee> search(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

    public Employee getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
