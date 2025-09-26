package com.example.securitydemo.controller;

import com.example.securitydemo.model.Employee;
import com.example.securitydemo.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

    // Only ADMIN can access
    @GetMapping("/employees")
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @PostMapping("/employees")
    public Employee add(@RequestBody Employee e) {
        return repo.save(e);
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }

    // Both USER and ADMIN can access
    @GetMapping("/profile")
    public String profile() {
        return "This is your profile!";
    }
}