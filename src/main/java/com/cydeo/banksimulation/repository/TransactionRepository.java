package com.cydeo.banksimulation.repository;

import com.cydeo.banksimulation.entity.Transaction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionRepository {

    public static List<Transaction> transactionList = new ArrayList<>();
    public Transaction save(Transaction transaction){
        transactionList.add(transaction);
        return transaction;
    }


    public List<Transaction> listAll() {
        return transactionList;
    }
}
