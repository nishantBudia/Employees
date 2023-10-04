package com.nishant.Employees.controller;


import com.nishant.Employees.model.Employees;
import com.nishant.Employees.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    /*
    POST
     */

    @PostMapping
    public String addEmployee(@RequestBody @Valid Employees employee){
        return service.addEmployee(employee);
    }

    /*
    GET
     */

    @GetMapping
    public List<Employees> getAllEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("{id}")
    public Employees getEmployee(@PathVariable UUID id){
        return service.getEmployee(id);
    }

    /*
    PUT
     */

    @PutMapping("{id}")
    public String updateEmployee(@PathVariable UUID id, @RequestBody Employees employee){
        return service.updateEmployee(id,employee);
    }

    /*
    DELETE
     */

    @DeleteMapping("{id}")
    public String deleteEmployee(@PathVariable UUID id){
        return service.deleteEmployee(id);
    }
}
