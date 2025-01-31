package org.example.paymentservice_dec2024.services;

import org.example.paymentservice_dec2024.paymentgateways.IPaymentGateway;
import org.example.paymentservice_dec2024.paymentgateways.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    @Override
    public String getPaymentLink(Long amount, String orderId, String phoneNumber, String name, String email) {
        IPaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();
        return paymentGateway.createStandardPaymentLink(amount, orderId, phoneNumber, name, email);
    }
}
