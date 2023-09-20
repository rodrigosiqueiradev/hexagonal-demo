package com.example.core.service;

import com.example.core.domain.Account;
import com.example.core.port.in.CreateAccountUseCase;
import com.example.core.port.out.AccountRepositoryPort;
import com.example.core.port.out.NotificationPort;
import java.math.BigDecimal;

public class AccountService implements CreateAccountUseCase {

  private final AccountRepositoryPort repository;
  private final NotificationPort notification;

  public AccountService(AccountRepositoryPort repository, NotificationPort notification) {
    this.repository = repository;
    this.notification = notification;
  }

  @Override
  public Account create(String name, String email) {
    System.out.println("Create account use case");
    return repository.create(name, email);
  }

  void deposit(String id, BigDecimal amount) {
    repository.deposit(id, amount);
  }

  void withdraw(String id, BigDecimal amount) {
    repository.withdraw(id, amount);
    final Account account = repository.fetch(id);
    if (account.balance.compareTo(BigDecimal.ZERO) < 0) {
      notification.notifyNegativeBalance(account);
    }
  }
}
