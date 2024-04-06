package com.example.payslipgenerator.employees;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "database_analysts")
public class DatabaseAnalyst extends Employee {
    private String toolName;

    @Enumerated(EnumType.STRING)
    private Experience experience;
    private double baseSalary = 5000;

    public DatabaseAnalyst(Long id, String name, String surname, String login, String password, String toolName, Experience experience) {
        super(id, name, surname, login, password);
        this.toolName = toolName;
        this.experience = experience;
        switch (experience) {
            case JUNIOR:
                this.baseSalary = baseSalary;
                break;
            case MID:
                this.baseSalary = baseSalary * 1.5;
                break;
            case SENIOR:
                this.baseSalary = baseSalary * 2;
                break;
            default:
                this.baseSalary = baseSalary;
        }
    }

    public DatabaseAnalyst() {
        super(null, null, null, null, null);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("Name: " + getName() + " " + getSurname());
        System.out.println("Position: Database Analyst");
        System.out.println("Experience: " + getExperience());
        System.out.println("Salary: " + getBaseSalary());
    }
}

