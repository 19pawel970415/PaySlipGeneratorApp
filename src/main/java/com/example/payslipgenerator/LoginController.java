package com.example.payslipgenerator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.example.payslipgenerator.service.PaySlipGeneratorService.checkSignIn;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {
        boolean loginSuccessful = checkSignIn(username, password);
        if (loginSuccessful) {
            model.addAttribute("username", username);
            return "redirect:/loggedIn?username=" + username;
        } else {
            return "redirect:/notSignedIn";
        }
    }
}
