package com.example.payslipgenerator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaySlipGeneratorController {

    @RequestMapping
    public String paySlipGenerator() {
        return "Pay Slip Generator";
    }
}
