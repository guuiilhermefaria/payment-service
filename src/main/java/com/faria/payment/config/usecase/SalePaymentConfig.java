package com.faria.payment.config.usecase;

import com.faria.payment.adapters.out.SavePaymentAdapter;
import com.faria.payment.adapters.out.SendValidatedPaymentAdapter;
import com.faria.payment.adapters.out.UpdateUserAdapter;
import com.faria.payment.application.core.usecase.FindUserByIdUseCase;
import com.faria.payment.application.core.usecase.SalePaymentUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalePaymentConfig {

    @Bean
    public SalePaymentUseCase salePaymentUseCase(FindUserByIdUseCase findUserByIdInputPort,
                                                 UpdateUserAdapter updateUserAdapter,
                                                 SavePaymentAdapter savePaymentAdapter,
                                                 SendValidatedPaymentAdapter sendValidatedPaymentAdapter) {
        return new SalePaymentUseCase(findUserByIdInputPort, updateUserAdapter, savePaymentAdapter, sendValidatedPaymentAdapter);
    }
}
