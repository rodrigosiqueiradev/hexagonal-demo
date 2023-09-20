package com.example.core.port.out;

import com.example.core.domain.Account;

import java.math.BigDecimal;

public interface AccountRepositoryPort {

    Account create(String name, String email);
    Account fetch(String id);
    void deposit(String id, BigDecimal amount);
    BigDecimal withdraw(String id, BigDecimal amount);
}
