package com.cydeo.banksimulation.repository;

import com.cydeo.banksimulation.entity.Account;
import com.cydeo.banksimulation.enums.AccountType;
import com.cydeo.banksimulation.exception.RecordNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class AccountRepository {

    public static List<Account> accountList = new ArrayList<>();

    public Account save(Account account){
        accountList.add(account);
        return account;
    }

    public List<Account> findAll(){
        return accountList;
    }

    public Account findById(UUID id) {
        return accountList.stream().filter(account -> account.getId() == id).findAny().orElseThrow(() -> new RecordNotFoundException("This account is not in database"));

    }
}
