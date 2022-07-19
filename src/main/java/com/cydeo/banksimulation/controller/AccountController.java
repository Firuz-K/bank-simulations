package com.cydeo.banksimulation.controller;


import com.cydeo.banksimulation.enums.AccountStatus;
import com.cydeo.banksimulation.enums.AccountType;
import com.cydeo.banksimulation.model.Account;
import com.cydeo.banksimulation.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/index")
    public String accountList(Model model){
        model.addAttribute("accountList",accountService.listAllAccounts());

        return "account/index";
    }

    @GetMapping("/create-form")
    public String create(Model model){
        model.addAttribute("account", Account.builder().build());
        model.addAttribute("accountTypes", AccountType.values());
        return "account/create-account";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("account") Account account, Model model){
        accountService.createNewAccount(account.getBalance(),
                new Date(),
                account.getAccountType(),
                account.getUserId());
        model.addAttribute("accountList", accountService.listAllAccounts());
       // model.addAttribute("accountTypes", AccountType.values());
        return "redirect:/index";
    }


    @GetMapping("/delete/{id}")
        public String deleteUser(@PathVariable("id") UUID id){
            accountService.deleteAccount(id);
            return "redirect:/index";

    }

}
