package com.example.core.port.in;

import com.example.core.domain.Account;

public interface CreateAccountUseCase {
    Account create(String name, String email);
}
