
package com.iiuc.employeemanagementsystem.controller;

import com.iiuc.employeemanagementsystem.model.Employee;
import com.iiuc.employeemanagementsystem.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // 1. GET /employees (This will return all employees)
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAll();
    }

    // 2. GET /employees/{id} (This will return one employee by ID)
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return service.getById(id);
    }

    // 3. POST /employees (This adds a new employee)
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.add(employee);
    }

    // 4. PUT /employees/{id} (This updates an employee)
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updated) {
        return service.update(id, updated);
    }

    // 5. DELETE /employees/{id} (This deletes an employee)
    @DeleteMapping("/{id}")
    public boolean deleteEmployee(@PathVariable Long id) {
        return service.delete(id);
    }
}
