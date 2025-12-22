package com.iiuc.employeemanagementsystem.service;

import org.springframework.stereotype.Service;
import com.iiuc.employeemanagementsystem.model.Employee;
import java.util.*;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();
    private Long nextId = 1L;

    // 1. Get all employees
    public List<Employee> getAll() {
        return employees; 
    }

    // 2. Add a new employee
    public Employee add(Employee emp) {
        emp.setId(nextId++);  
        employees.add(emp);   
        return emp;           
    }

    // 3. Find an employee by ID
    public Employee getById(Long id) {
        for (Employee emp : employees) {
            if (emp.getId().equals(id)) { 
                return emp;              
            }
        }
        return null; 
    }

    // 4. Update an employee
    public Employee update(Long id, Employee updated) {
        Employee existingEmployee = getById(id);

        if (existingEmployee != null) { 
            existingEmployee.setName(updated.getName());
            existingEmployee.setEmail(updated.getEmail());
            existingEmployee.setDesignation(updated.getDesignation());
            return existingEmployee; 
        }

        return null; 
    }

    // 5. Delete an employee
    public boolean delete(Long id) {
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            if (emp.getId().equals(id)) { 
                employees.remove(i);      
                return true;              
            }
        }
        return false;
    }
}