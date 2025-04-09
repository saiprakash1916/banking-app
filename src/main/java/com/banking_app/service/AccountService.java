package com.banking_app.service;

import com.banking_app.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double balance);

    AccountDto withdraw(Long id, double balance);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
