package com.faria.payment.adapters.out;

import com.faria.payment.adapters.out.message.SaleMessage;
import com.faria.payment.application.core.domain.Sale;
import com.faria.payment.application.core.domain.enums.SaleEvent;
import com.faria.payment.application.ports.out.SendValidatedPaymentOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendValidatedPaymentAdapter implements SendValidatedPaymentOutputPort {

    @Autowired
    private KafkaTemplate<String, SaleMessage> kafkaTemplate;

    @Override
    public void send(Sale sale, SaleEvent event) {
        var saleMessage = new SaleMessage(sale, event);
        kafkaTemplate.send("tp-saga-sale", saleMessage);
    }
}
