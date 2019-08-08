package com.AllanRibeiro;

public class Main {

    public static void main(String[] args) {

        BankAccount ac = new BankAccount(1234,500.00,
                                "Allan", "allan@hotmail.com",
                                "1458-5468");

        ac.depositFund(0.00);
        ac.withdrawl(500.00);
        System.out.println("Account balance: " + ac.getBalance());
        //Challenge

        System.out.println("### Challenge ###");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Allan",25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00,
                                            "Tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
