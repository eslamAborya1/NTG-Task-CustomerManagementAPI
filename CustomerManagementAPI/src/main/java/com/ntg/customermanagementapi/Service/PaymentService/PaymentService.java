package com.ntg.customermanagementapi.Service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    ApplePay applePay;
    PayPal payPal;
    StripePayment stripe;

    public PaymentService(ApplePay applePay, PayPal payPal, StripePayment stripe) {
        this.applePay = applePay;
        this.payPal = payPal;
        this.stripe = stripe;
    }

    public String paymentProcess(Long accountNumber, String paymentMethod) {
        switch (paymentMethod.toLowerCase()) {
            case "applepay":
                return applePay.pay(accountNumber);

            case "paypal":
                return payPal.pay(accountNumber);

            case "stripe":
                return stripe.pay(accountNumber);

            default:
                return "Invalid Payment Method";
        }
    }
}
