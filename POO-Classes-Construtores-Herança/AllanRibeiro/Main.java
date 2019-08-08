package com.AllanRibeiro;

public class Main {

    public static void main(String[] args) {

        BankAccount ac = new BankAccount(1234,500,
                                "Allan", "allan@hotmail.com",
                                "1458-5468");

        ac.depositFund(50.00);
        ac.withdrawl(1000.00);
        System.out.println("Account balance: " + ac.getBalance());
    }
}
