package com.example.application.write;

import com.example.adapter.db.DbAdapterConfiguration;
import com.example.adapter.rest.RestAdapterConfiguration;
import com.example.core.domain.Account;
import com.example.core.port.out.AccountRepositoryPort;
import com.example.core.port.out.NotificationPort;
import com.example.core.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DbAdapterConfiguration.class, RestAdapterConfiguration.class})
public class WriteApplicationConfiguration {
    @Bean
    AccountService accountService(AccountRepositoryPort accountRepositoryPort) {
        return new AccountService(accountRepositoryPort, new NotificationPort() {
            @Override
            public void notifyCreation(Account account) {
                System.out.println("notifyCreation");
            }

            @Override
            public void notifyNegativeBalance(Account account) {
                System.out.println("notifyNegativeBalance");
            }
        });
    }
}
