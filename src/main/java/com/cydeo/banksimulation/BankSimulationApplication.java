package com.cydeo.banksimulation;

import com.cydeo.banksimulation.enums.AccountStatus;
import com.cydeo.banksimulation.model.Account;
import com.cydeo.banksimulation.enums.AccountType;
import com.cydeo.banksimulation.service.AccountService;
import com.cydeo.banksimulation.service.TransactionService;
import com.cydeo.banksimulation.service.impl.AccountServiceImpl;
import com.cydeo.banksimulation.service.impl.TransactionServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class BankSimulationApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BankSimulationApplication.class, args);
//        AccountService accountService = applicationContext.getBean(AccountServiceImpl.class);
//        TransactionService transactionService = applicationContext.getBean(TransactionServiceImpl.class);
//
//        Account receiver = accountService.createNewAccount( BigDecimal.TEN, new Date(), AccountType.CHECKING, 1L,AccountStatus.ACTIVE) ;
//        Account sender =  accountService.createNewAccount(new BigDecimal(70), new Date(), AccountType.CHECKING, 2L,AccountStatus.ACTIVE);
//
//        accountService.listAllAccounts().forEach(System.out::println);
//
//        transactionService.makeTransfer(BigDecimal.TEN, new Date(), sender, receiver, "transfer no:1");
//
//        System.out.println(transactionService.findAll().get(0));
//        accountService.listAllAccounts().forEach(System.out::println);
//
//        transactionService.makeTransfer(new BigDecimal(15), new Date(), sender, receiver, "transfer no:2");
//
//        System.out.println(transactionService.findAll().get(1));
//        accountService.listAllAccounts().forEach(System.out::println);
   }

}
