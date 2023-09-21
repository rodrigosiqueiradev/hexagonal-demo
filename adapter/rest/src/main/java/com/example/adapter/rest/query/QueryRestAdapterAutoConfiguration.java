package com.example.adapter.rest.query;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan(
    basePackages = {
      "com.example.adapter.rest.query.controller",
    })
public class QueryRestAdapterAutoConfiguration {}
