package com.example.adapter.rest.query.controller;

import com.example.adapter.rest.query.dto.AccountDto;
import com.example.core.domain.Account;
import com.example.core.port.in.FetchAccountUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping(path = "/account")
public class QueryAccountController {

  private final FetchAccountUseCase fetchAccountUseCase;

  public QueryAccountController(FetchAccountUseCase fetchAccountUseCase) {
    this.fetchAccountUseCase = fetchAccountUseCase;
  }

  @GetMapping(path = "/{id}")
  public AccountDto fetch(@PathVariable int id) {
    final Optional<Account> account = fetchAccountUseCase.fetch(id);

    if (account.isEmpty()) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    AccountDto dto = new AccountDto();
    dto.id = account.get().id;
    dto.name = account.get().name;

    return dto;
  }
}
