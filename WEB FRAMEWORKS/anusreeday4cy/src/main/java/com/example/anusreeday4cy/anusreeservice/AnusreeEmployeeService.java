package com.example.day4cy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cy.model.Employee;
import com.example.day4cy.repository.EmployeeRepo;

@Service
public class AnusreeEmployeeService {
    public AnusreeEmployeeRepo employeeRepo;
    public AnusreeEmployeeService(AnusreeEmployeeRepo employeeRepo)
    {
        this.employeeRepo=employeeRepo;
    }
    public boolean saveEmployee(AnusreeEmployee employee)
    {
        try{
            employeeRepo.save(employee);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AnusreeEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }
    public AnusreeEmployee getEmployeeById(int id)
    {
        Optional<AnusreeEmployee> obj = employeeRepo.findById(id);
        return obj.orElse(null);
    }
}
