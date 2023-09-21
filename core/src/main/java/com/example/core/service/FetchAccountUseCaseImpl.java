package com.example.core.service;

import com.example.core.domain.Account;
import com.example.core.port.in.FetchAccountUseCase;
import com.example.core.port.out.FetchAccountPort;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FetchAccountUseCaseImpl implements FetchAccountUseCase {

  private final Logger logger = Logger.getLogger(FetchAccountUseCaseImpl.class.getName());
  private final FetchAccountPort fetchAccountPort;

  public FetchAccountUseCaseImpl(FetchAccountPort fetchAccountPort) {
    this.fetchAccountPort = fetchAccountPort;
  }

  @Override
  public Optional<Account> fetch(int id) {
    logger.log(Level.INFO, "FetchAccountUseCase id: %s".formatted(id));
    return fetchAccountPort.fetch(id);
  }
}
