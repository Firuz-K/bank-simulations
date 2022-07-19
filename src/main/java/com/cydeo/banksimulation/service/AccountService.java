package com.cydeo.banksimulation.service;

import com.cydeo.banksimulation.enums.AccountStatus;
import com.cydeo.banksimulation.model.Account;
import com.cydeo.banksimulation.enums.AccountType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface AccountService {

    Account createNewAccount(BigDecimal balance, Date createionDate, AccountType accountType, Long userId);

    List<Account> listAllAccounts();

    void deleteAccount(UUID id);
}
