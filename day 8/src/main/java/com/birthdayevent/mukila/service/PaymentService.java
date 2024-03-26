package com.birthdayevent.mukila.service;

import java.util.List;

import com.birthdayevent.mukila.dto.request.PaymentRequest;
import com.birthdayevent.mukila.dto.response.PaymentResponse;
import com.birthdayevent.mukila.model.Payment;

public interface PaymentService {
    PaymentResponse createPayment(PaymentRequest request);

    List<Payment> getAllPayments();

    List<Payment> getPaymentsByUserId(String userId);

    Long sumAmounts();
}
