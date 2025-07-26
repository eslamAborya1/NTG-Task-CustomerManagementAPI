package com.ntg.customermanagementapi.Service.PaymentService;

import org.springframework.stereotype.Component;

@Component
public class ApplePay implements Payment{
    @Override
    public String pay(Long accountNumber) {
        return "Customer No: "+ accountNumber +" will pay with --> 'ApplePay'";
    }
}
