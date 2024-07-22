package com.example.calculator.salary_calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.calculator.salary_calculator.entity.Employee;
import com.example.calculator.salary_calculator.repository.EmplRepo;

@Service
public class EmplService {
    @Autowired
private EmplRepo emplRepo;
public Employee saveEmployee(Employee employee){
    return emplRepo.save(employee);
}
public void deleteEmployee(long id){
    emplRepo.deleteById(id);
}
public Employee getEmployee(long id){
    return emplRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Emploee ID: "+id+" does not exist in the database!!!"));
}
}
