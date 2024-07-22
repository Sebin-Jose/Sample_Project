package com.example.calculator.salary_calculator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor

@Setter
@Getter
@Table(name="Emp_Table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String designation;
private Double salary;
private Float leavetaken;
private double monthlysalary;
}



