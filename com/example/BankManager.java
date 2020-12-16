package com.example;

public class BankManager {
    private final static int SUCCESS = 0;

    private final static int ERROR = 1;

    public static int takeLoan(String accountNumber, int loanAmount) {
        boolean existsAccount = BankSystem.existsAccount(accountNumber);

        if (existsAccount == false) {
            System.out.println("口座情報が存在しません");

            return ERROR;
        }

        boolean checkRepaymentStatus = BankSystem.isTakeLoan(accountNumber);

        if (checkRepaymentStatus == false) {
            System.out.println("返済が滞っているため、新規ローンを組めません");

            return ERROR;
        }

        boolean takeLoan = BankSystem.takeLoan(accountNumber, loanAmount);

        if (takeLoan == false) {
            System.out.println("ローンを組むのに失敗しました");

            return ERROR;
        }

        System.out.println("ローンを組みました");

        return SUCCESS;
    }
}
