package org.example.paymentservice_dec2024.paymentgateways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {

    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    public IPaymentGateway getBestPaymentGateway() {
        return  razorpayPaymentGateway;
    }
}
