package com.example.adapter.db;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@AutoConfiguration
@EnableJpaRepositories(basePackages = {"com.example.adapter.db.repo"})
@EntityScan(basePackages = {"com.example.adapter.db.entity"})
@ComponentScan(basePackages = {"com.example.adapter.db"})
public class DbAdapterAutoConfiguration {

}
