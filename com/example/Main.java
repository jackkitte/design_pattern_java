package com.example;

public class Main {
    public static void main(String[] args) {
        String yamadaAccount = "0001";
        int yamadaResult = BankManager.takeLoan(yamadaAccount, 1000000);

        System.out.println();

        String tanakaAccount = "0002";
        int tanakaResul = BankManager.takeLoan(tanakaAccount, 1000000);
    }
}
