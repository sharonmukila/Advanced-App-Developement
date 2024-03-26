package com.birthdayevent.mukila.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {

    private String userId;
    private Long amount;
    private Date paidDate;
    private String paymentMethod;




}
