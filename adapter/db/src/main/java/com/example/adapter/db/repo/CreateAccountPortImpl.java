package com.example.adapter.db.repo;

import com.example.adapter.db.entity.AccountEntity;
import com.example.core.domain.Account;
import com.example.core.port.out.CreateAccountPort;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class CreateAccountPortImpl implements CreateAccountPort {

  private final AccountRepository accountRepository;

  public CreateAccountPortImpl(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @Override
  public Account create(String name, String email) {
    AccountEntity accountEntity = new AccountEntity();
    accountEntity.email = email;
    accountEntity.name = name;
    accountEntity.balance = BigDecimal.ZERO;

    final AccountEntity saved = accountRepository.save(accountEntity);

    Account created = new Account();
    created.id = saved.id;
    created.balance = saved.balance;
    created.email = saved.email;
    created.name = saved.name;

    return created;
  }
}
