package com.faria.payment.application.ports.out;

import com.faria.payment.application.core.domain.User;

import java.util.Optional;

public interface FindUserByIdOutputPort {

    Optional<User> find(Integer userId);
}
