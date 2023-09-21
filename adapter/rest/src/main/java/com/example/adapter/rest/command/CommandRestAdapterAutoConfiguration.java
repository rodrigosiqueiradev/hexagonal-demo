package com.example.adapter.rest.command;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan(
    basePackages = {
      "com.example.adapter.rest.command.controller",
    })
public class CommandRestAdapterAutoConfiguration {}
