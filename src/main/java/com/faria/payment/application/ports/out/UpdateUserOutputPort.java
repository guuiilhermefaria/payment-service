package com.faria.payment.application.ports.out;

import com.faria.payment.application.core.domain.User;

public interface UpdateUserOutputPort {

    void update(User user);
}
