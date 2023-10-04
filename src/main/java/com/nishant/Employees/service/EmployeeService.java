package com.nishant.Employees.service;


import com.nishant.Employees.model.Employees;
import com.nishant.Employees.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo repo;

    public String addEmployee(Employees employee) {
        return repo.save(employee).toString();
    }

    public List<Employees> getAllEmployees() {
        return repo.findAll();
    }

    public Employees getEmployee(UUID id) {
        return repo.findById(id).get();
    }

    public String updateEmployee(UUID id, Employees employee) {
        employee.setId(id);
        return repo.save(employee).toString();
    }

    public String deleteEmployee(UUID id) {
        repo.deleteById(id);
        return "Success";
    }
}
