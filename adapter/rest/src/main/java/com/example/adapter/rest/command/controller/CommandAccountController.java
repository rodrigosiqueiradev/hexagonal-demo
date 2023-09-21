package com.example.adapter.rest.command.controller;

import com.example.adapter.rest.command.dto.AccountDto;
import com.example.adapter.rest.command.dto.CreateAccountDto;
import com.example.core.domain.Account;
import com.example.core.port.in.CreateAccountUseCase;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/account")
public class CommandAccountController {
    
    final CreateAccountUseCase createAccountUseCase;

    public CommandAccountController(CreateAccountUseCase createAccountUseCase) {
        this.createAccountUseCase = createAccountUseCase;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public AccountDto createAccount(@RequestBody CreateAccountDto createAccountDto) {
        Account account = createAccountUseCase.create(createAccountDto.name, createAccountDto.email);
        AccountDto dto = new AccountDto();
        dto.id = account.id;
        dto.name = account.name;
        return dto;
    }
}
