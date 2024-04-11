package com.example.payslipgenerator.repository;

public interface DataToDbHandler {

    void addDataToDb(String name, String surname, String login, String password, String toolName, String experience);

}
