package org.example.paymentservice_dec2024.paymentgateways;

public interface IPaymentGateway {
    String createStandardPaymentLink(Long amount, String orderId, String phoneNumber, String name, String email);
}
