package com.banking_app.service.impl;

import com.banking_app.dto.AccountDto;
import com.banking_app.respository.AccountRepository;
import com.banking_app.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }



    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
