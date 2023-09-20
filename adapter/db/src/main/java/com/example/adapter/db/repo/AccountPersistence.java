package com.example.adapter.db.repo;

import com.example.adapter.db.entity.AccountEntity;
import com.example.core.domain.Account;
import com.example.core.port.out.AccountRepositoryPort;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;

@Component
public class AccountPersistence implements AccountRepositoryPort {

    final AccountRepository accountRepository;

    public AccountPersistence(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account create(String name, String email) {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.email = email;
        accountEntity.name = name;
        accountEntity.balance = BigDecimal.ZERO;
        accountEntity = accountRepository.save(accountEntity);
        Account created = new Account();
        created.id = accountEntity.id;
        created.balance = accountEntity.balance;
        created.email = accountEntity.email;
        created.name = accountEntity.name;
        return created;
    }

    @Override
    public Account fetch(String id) {
        return null;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {

    }

    @Override
    public BigDecimal withdraw(String id, BigDecimal amount) {
        return null;
    }
}
