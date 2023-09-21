package com.example.core.port.out;

import com.example.core.domain.Account;

import java.util.Optional;

public interface FetchAccountPort {
    Optional<Account> fetch(int id);
}
