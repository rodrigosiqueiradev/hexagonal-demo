package com.example.application.query;

import com.example.adapter.db.DbAdapterAutoConfiguration;
import com.example.adapter.rest.query.QueryRestAdapterAutoConfiguration;
import com.example.core.port.in.FetchAccountUseCase;
import com.example.core.port.out.FetchAccountPort;
import com.example.core.service.FetchAccountUseCaseImpl;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ImportAutoConfiguration({
  DbAdapterAutoConfiguration.class,
  QueryRestAdapterAutoConfiguration.class
})
public class QueryApplicationConfiguration {

    @Bean
    public FetchAccountUseCase fetchAccountUseCase(FetchAccountPort fetchAccountPort) {
    return new FetchAccountUseCaseImpl(fetchAccountPort);
    }
}
