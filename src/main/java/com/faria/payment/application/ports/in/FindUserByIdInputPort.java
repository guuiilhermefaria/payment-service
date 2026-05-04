package com.faria.payment.application.ports.in;

import com.faria.payment.application.core.domain.User;

public interface FindUserByIdInputPort {

    User find(final Integer id);
}
