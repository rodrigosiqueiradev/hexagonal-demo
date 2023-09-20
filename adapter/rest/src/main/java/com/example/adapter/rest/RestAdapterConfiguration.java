package com.example.adapter.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.example.adapter.rest.controller"
})
public class RestAdapterConfiguration {}
