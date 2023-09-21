package com.example.application.command;

import com.example.adapter.db.DbAdapterAutoConfiguration;
import com.example.adapter.rest.command.CommandRestAdapterAutoConfiguration;
import com.example.core.port.in.CreateAccountUseCase;
import com.example.core.port.out.CreateAccountPort;
import com.example.core.service.CreateAccountUseCaseImpl;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ImportAutoConfiguration({
  DbAdapterAutoConfiguration.class,
  CommandRestAdapterAutoConfiguration.class
})
public class CommandApplicationConfiguration {

    @Bean
    public CreateAccountUseCase createAccountUseCase(CreateAccountPort createAccountPort) {
        return new CreateAccountUseCaseImpl(createAccountPort);
    }
}
