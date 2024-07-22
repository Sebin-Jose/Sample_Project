package com.example.calculator.salary_calculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.calculator.salary_calculator.entity.Employee;
@Repository
public interface EmplRepo extends JpaRepository<Employee, Long>{

}
