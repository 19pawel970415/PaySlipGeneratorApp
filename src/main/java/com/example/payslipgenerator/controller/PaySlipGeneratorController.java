package com.example.payslipgenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaySlipGeneratorController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String getIndex() {
        return "index";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String getSignInPage() {
        return "login/signin";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String getSignUpPage() {
        return "register/signup";
    }

    @RequestMapping(value = "/register_cpp", method = RequestMethod.GET)
    public String getCppDeveloperRegistrationPage() {
        return "register/register_cpp";
    }

    @RequestMapping(value = "/register_csharp", method = RequestMethod.GET)
    public String getCsharpDeveloperRegistrationPage() {
        return "register/register_csharp";
    }

    @RequestMapping(value = "/register_database", method = RequestMethod.GET)
    public String getDatabaseDeveloperRegistrationPage() {
        return "register/register_database";
    }

    @RequestMapping(value = "/register_frontend", method = RequestMethod.GET)
    public String getFrontendDeveloperRegistrationPage() {
        return "register/register_frontend";
    }

    @RequestMapping(value = "/register_java", method = RequestMethod.GET)
    public String getJavaDeveloperRegistrationPage() {
        return "register/register_java";
    }

    @RequestMapping(value = "/register_python", method = RequestMethod.GET)
    public String getPythonDeveloperRegistrationPage() {
        return "register/register_python";
    }

    @RequestMapping(value = "/notSignedIn", method = RequestMethod.GET)
    public String getNotSignedIn() {
        return "login/notSignedIn";
    }

    @RequestMapping(value = "/loggedIn", method = RequestMethod.GET)
    public String getSignedIn() {
        return "login/loggedIn";
    }

    @RequestMapping(value = "/registration_success", method = RequestMethod.GET)
    public String getRegistrationSuccess() {
        return "register/registration_success";
    }

    @RequestMapping(value = "/registration_failure", method = RequestMethod.GET)
    public String getRegistrationFailure() {
        return "register/registration_failure";
    }
}

