package com.faria.payment.application.ports.out;

import com.faria.payment.application.core.domain.Sale;
import com.faria.payment.application.core.domain.enums.SaleEvent;

public interface SendValidatedPaymentOutputPort {

    void send(Sale sale, SaleEvent event);
}
