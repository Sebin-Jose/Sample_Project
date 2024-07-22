package com.example.calculator.salary_calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.salary_calculator.entity.Employee;
import com.example.calculator.salary_calculator.service.EmplService;

@RestController
@RequestMapping("/empmgmt")
public class EmplController {
@Autowired
private EmplService emplService;
@PostMapping
public Employee saveEmployee(@RequestBody Employee employee){
    return emplService.saveEmployee(employee);
}
@GetMapping("/{id}/{numDays}")
public ResponseEntity<Employee> calculateSalary(@PathVariable Long id, @PathVariable float numDays){
    Employee employee=emplService.getEmployee(id);
    
    double monPay;
    if(numDays<=1){
        monPay=employee.getSalary();
    }else{
        double dailyPay=employee.getSalary()/30;
        monPay=employee.getSalary()-(dailyPay*(numDays-1));
    }
    System.out.println("Monthy Paty>>>>"+monPay);
    
    employee.setLeavetaken(numDays);
    employee.setMonthlysalary(monPay);
    return ResponseEntity.ok(emplService.saveEmployee(employee));
}
}
