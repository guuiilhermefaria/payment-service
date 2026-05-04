package com.faria.payment.adapters.out.repository.mapper;

import com.faria.payment.adapters.out.repository.entity.PaymentEntity;
import com.faria.payment.application.core.domain.Payment;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface PaymentEntityMapper {

    PaymentEntity toPaymentEntity(Payment payment);

    Payment toPayment(PaymentEntity paymentEntity);
}
