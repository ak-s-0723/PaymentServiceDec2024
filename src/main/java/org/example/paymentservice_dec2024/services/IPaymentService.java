package org.example.paymentservice_dec2024.services;


public interface IPaymentService {
    String getPaymentLink(Long amount, String orderId, String phoneNumber, String name, String email);
}
