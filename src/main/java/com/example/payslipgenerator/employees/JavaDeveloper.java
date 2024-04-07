package com.example.payslipgenerator.employees;

import lombok.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "java_developers")
public class JavaDeveloper extends Employee implements DataToDbHandler {
    private String toolName;

    @Enumerated(EnumType.STRING)
    private Experience experience;
    private double baseSalary = 6000;

    public JavaDeveloper(Long id, String name, String surname, String login, String password, String toolname, Experience experience) {
        super(id, name, surname, login, password);
        this.toolName = toolName;
        this.experience = experience;
        switch (this.experience) {
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

    public JavaDeveloper() {
        super(null, null, null, null, null);
    }


    @Override
    public String[] generatePaySlip() {
        String[] paySlip = new String[5];
        paySlip[0] = getName();
        paySlip[1] = getSurname();
        paySlip[2] = "Java Developer";
        paySlip[3] = String.valueOf(getExperience());
        paySlip[4] = String.valueOf(getBaseSalary());
        return paySlip;
    }

    @Override
    public void addDataToDb(String name, String surname, String login, String password, String toolName, String experience) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            JavaDeveloper javaDeveloper = new JavaDeveloper(null, name, surname, login, password, toolName, Experience.valueOf(experience.toUpperCase()));
            session.save(javaDeveloper);

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}

