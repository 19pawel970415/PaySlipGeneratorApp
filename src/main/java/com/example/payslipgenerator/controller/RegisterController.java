package com.example.payslipgenerator.controller;

import com.example.payslipgenerator.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.example.payslipgenerator.service.PaySlipGeneratorService.checkLoginDuplicates;

@Controller
public class RegisterController {

    @PostMapping("/register_python")
    public String registerPythonDeveloper(@RequestParam String name,
                                          @RequestParam String surname,
                                          @RequestParam String login,
                                          @RequestParam String password,
                                          @RequestParam String toolname,
                                          @RequestParam String experience) {

        boolean isValid = checkLoginDuplicates(login);
        if (!isValid) {
            return "redirect:/registration_failure";
        } else {
            PythonDeveloper pythonDeveloper = new PythonDeveloper();
            pythonDeveloper.addDataToDb(name, surname, login, password, toolname, experience);

            return "redirect:/registration_success";
        }
    }

    @PostMapping("/register_java")
    public String registerJavaDeveloper(@RequestParam String name,
                                        @RequestParam String surname,
                                        @RequestParam String login,
                                        @RequestParam String password,
                                        @RequestParam String toolname,
                                        @RequestParam String experience) {

        boolean isValid = checkLoginDuplicates(login);
        if (!isValid) {
            return "redirect:/registration_failure";
        } else {
            JavaDeveloper javaDeveloper = new JavaDeveloper();
            javaDeveloper.addDataToDb(name, surname, login, password, toolname, experience);

            return "redirect:/registration_success";
        }
    }

    @PostMapping("/register_frontend")
    public String registerFrontEndDeveloper(@RequestParam String name,
                                            @RequestParam String surname,
                                            @RequestParam String login,
                                            @RequestParam String password,
                                            @RequestParam String toolname,
                                            @RequestParam String experience) {

        boolean isValid = checkLoginDuplicates(login);
        if (!isValid) {
            return "redirect:/registration_failure";
        } else {
            FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
            frontEndDeveloper.addDataToDb(name, surname, login, password, toolname, experience);

            return "redirect:/registration_success";
        }
    }

    @PostMapping("/register_database")
    public String registerDatabaseDeveloper(@RequestParam String name,
                                            @RequestParam String surname,
                                            @RequestParam String login,
                                            @RequestParam String password,
                                            @RequestParam String toolname,
                                            @RequestParam String experience) {

        boolean isValid = checkLoginDuplicates(login);
        if (!isValid) {
            return "redirect:/registration_failure";
        } else {
            DatabaseAnalyst databaseAnalyst = new DatabaseAnalyst();
            databaseAnalyst.addDataToDb(name, surname, login, password, toolname, experience);

            return "redirect:/registration_success";
        }
    }

    @PostMapping("/register_csharp")
    public String registerCsharpDeveloper(@RequestParam String name,
                                          @RequestParam String surname,
                                          @RequestParam String login,
                                          @RequestParam String password,
                                          @RequestParam String toolname,
                                          @RequestParam String experience) {

        boolean isValid = checkLoginDuplicates(login);
        if (!isValid) {
            return "redirect:/registration_failure";
        } else {
            CSharpDeveloper cSharpDeveloper = new CSharpDeveloper();
            cSharpDeveloper.addDataToDb(name, surname, login, password, toolname, experience);

            return "redirect:/registration_success";
        }
    }

    @PostMapping("/register_cpp")
    public String registerCppDeveloper(@RequestParam String name,
                                       @RequestParam String surname,
                                       @RequestParam String login,
                                       @RequestParam String password,
                                       @RequestParam String toolname,
                                       @RequestParam String experience) {

        boolean isValid = checkLoginDuplicates(login);
        if (!isValid) {
            return "redirect:/registration_failure";
        } else {
            CppDeveloper cppDeveloper = new CppDeveloper();
            cppDeveloper.addDataToDb(name, surname, login, password, toolname, experience);

            return "redirect:/registration_success";
        }
    }
}

