package com.nishant.Employees.repo;

import com.nishant.Employees.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeRepo extends JpaRepository<Employees, UUID> {
}
