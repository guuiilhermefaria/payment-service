package com.faria.payment.application.ports.in;

import com.faria.payment.application.core.domain.Sale;

public interface SalePaymentInputPort {

    void payment(Sale sale);
}
