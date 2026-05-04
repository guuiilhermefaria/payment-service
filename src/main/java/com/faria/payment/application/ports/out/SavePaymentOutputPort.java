package com.faria.payment.application.ports.out;

import com.faria.payment.application.core.domain.Payment;

public interface SavePaymentOutputPort {

    void save(Payment payment);
}
