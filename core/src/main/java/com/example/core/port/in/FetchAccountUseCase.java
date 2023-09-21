package com.example.core.port.in;

import com.example.core.domain.Account;

import java.util.Optional;

public interface FetchAccountUseCase {
    Optional<Account> fetch(int id);
}
