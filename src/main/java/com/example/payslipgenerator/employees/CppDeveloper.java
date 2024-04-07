package com.example.payslipgenerator.employees;

import lombok.Getter;
import lombok.Setter;
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
@Table(name = "cpp_developers")
public class CppDeveloper extends Employee implements DataToDbHandler {
    private String toolName;

    @Enumerated(EnumType.STRING)
    private Experience experience;
    private double baseSalary = 4000;

    public CppDeveloper(Long id, String name, String surname, String login, String password, String toolName, Experience experience) {
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

    public CppDeveloper() {
        super(null, null, null, null, null);
    }

    @Override
    public String[] generatePaySlip() {
        String[] paySlip = new String[5];
        paySlip[0] = getName();
        paySlip[1] = getSurname();
        paySlip[2] = "C++ Developer";
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

            CppDeveloper cppDeveloper = new CppDeveloper(null, name, surname, login, password, toolName, Experience.valueOf(experience.toUpperCase()));
            session.save(cppDeveloper);

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}

