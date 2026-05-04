package com.faria.payment.config.usecase;

import com.faria.payment.adapters.out.FindUserByIdAdapter;
import com.faria.payment.application.core.usecase.FindUserByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindUserByIdConfig {

    @Bean
    public FindUserByIdUseCase findUserByIdUseCase(FindUserByIdAdapter findUserByIdAdapter) {
        return new FindUserByIdUseCase(findUserByIdAdapter);
    }
}
