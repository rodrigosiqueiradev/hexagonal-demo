package com.example.core.port.out;

import com.example.core.domain.Account;

public interface CreateAccountPort {
    Account create(String name, String email);
}
