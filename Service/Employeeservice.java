package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.repository.Employeerepository;

@Service
public class Employeeservice {
    @Autowired
    Employeerepository empRepo;
    public Employee addEmployee(Employee emp)
    {
        return empRepo.save(emp);
    }
    public List<Employee> getEmployee()
    {
        return empRepo.findAll();
    }
    public Employee updateEmployee(int id,Employee emp)
    {
        emp.setId(id);
        return empRepo.save(emp);
    }

}
