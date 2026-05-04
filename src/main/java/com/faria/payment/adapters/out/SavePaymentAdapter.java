package com.faria.payment.adapters.out;

import com.faria.payment.adapters.out.repository.PaymentRepository;
import com.faria.payment.adapters.out.repository.mapper.PaymentEntityMapper;
import com.faria.payment.application.core.domain.Payment;
import com.faria.payment.application.ports.out.SavePaymentOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SavePaymentAdapter implements SavePaymentOutputPort {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentEntityMapper paymentEntityMapper;

    @Override
    public void save(Payment payment) {
        paymentRepository.save(paymentEntityMapper.toPaymentEntity(payment));
    }
}
