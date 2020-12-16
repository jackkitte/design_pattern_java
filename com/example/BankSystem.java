package com.example;

import java.util.HashMap;
import java.util.Map;

public class BankSystem {
    private static Map<String, Account> accountMap = new HashMap<>();

    static {
        Account yamada = new Account(1, "0001", "普通", "山田太郎", 100000, 1000000, 1);
        Account tanaka = new Account(1, "0002", "普通", "田中花子", 200000, 0, 0);

        accountMap.put("0001", yamada);
        accountMap.put("0002", tanaka);
    }

    public static Account getAccount(String accountNumber) {
        return accountMap.get(accountNumber);
    }

    public static boolean existsAccount(String accountNumber) {
        Account account = getAccount(accountNumber);

        if (account == null) {
            return false;
        }

        return true;
    }

    public static boolean isTakeLoan(String accountNumber) {
        Account account = getAccount(accountNumber);

        if (account.getRepaymentStatus() == 1) {
            return false;
        }

        return true;
    }

    public static boolean takeLoan(String accountNumber, int loanAmount) {
        Account account = getAccount(accountNumber);

        account.setDeposit(account.getDeposit() + loanAmount);

        account.setLoan(account.getLoan() + loanAmount);

        System.out.println(account.getAccountHolder() + " Deposit: " + account.getDeposit());
        System.out.println(account.getAccountHolder() + " Loan: " + account.getLoan());

        return true;
    }
}
