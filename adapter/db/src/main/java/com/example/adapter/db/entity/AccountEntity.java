package com.example.adapter.db.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
public class AccountEntity {
    @Id
    @GeneratedValue
    public int id;

    public String name;
    public String email;
    public BigDecimal balance;
}
