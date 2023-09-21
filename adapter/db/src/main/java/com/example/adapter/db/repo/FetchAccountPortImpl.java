package com.example.adapter.db.repo;

import com.example.adapter.db.entity.AccountEntity;
import com.example.core.domain.Account;
import com.example.core.port.out.FetchAccountPort;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class FetchAccountPortImpl implements FetchAccountPort {
  private final AccountRepository accountRepository;

  public FetchAccountPortImpl(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @Override
  public Optional<Account> fetch(int id) {
    final Optional<AccountEntity> accountEntity = accountRepository.findById(id);

    if (accountEntity.isEmpty()) {
      return Optional.empty();
    }

    Account account = new Account();
    account.id = accountEntity.get().id;
    account.name = accountEntity.get().name;
    account.email = accountEntity.get().email;
    account.balance = accountEntity.get().balance;

    return Optional.of(account);
  }
}
