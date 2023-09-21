package com.example.core.service;

import com.example.core.domain.Account;
import com.example.core.port.in.CreateAccountUseCase;
import com.example.core.port.out.CreateAccountPort;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateAccountUseCaseImpl implements CreateAccountUseCase {

  private final Logger logger = Logger.getLogger(CreateAccountUseCaseImpl.class.getName());
  private final CreateAccountPort createAccountPort;

  public CreateAccountUseCaseImpl(CreateAccountPort createAccountPort) {
    this.createAccountPort = createAccountPort;
  }

  @Override
  public Account create(String name, String email) {
    logger.log(Level.INFO, "Create Account %s, %s".formatted(name, email));
    return createAccountPort.create(name, email);
  }
}
