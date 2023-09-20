package com.example.core.port.out;

import com.example.core.domain.Account;

public interface NotificationPort {
    void notifyCreation(Account account);
    void notifyNegativeBalance(Account account);
}
