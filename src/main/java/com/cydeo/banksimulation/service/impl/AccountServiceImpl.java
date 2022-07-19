package com.cydeo.banksimulation.service.impl;

import com.cydeo.banksimulation.enums.AccountStatus;
import com.cydeo.banksimulation.model.Account;
import com.cydeo.banksimulation.enums.AccountType;
import com.cydeo.banksimulation.repository.AccountRepository;
import com.cydeo.banksimulation.service.AccountService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account createNewAccount(BigDecimal balance, Date creationDate, AccountType accountType, Long userId) {
        Account account = Account.builder()
                .id(UUID.randomUUID()).userId(userId).accountType(accountType)
                .balance(balance).creationDate(creationDate).build();
        return accountRepository.save(account);
    }


    @Override
    public List<Account> listAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public void deleteAccount(UUID accountId) {
        Account account = accountRepository.findById(accountId);
        account.setAccountStatus(AccountStatus.DELETED);
        accountRepository.deleteAccount(account);

    }
}
