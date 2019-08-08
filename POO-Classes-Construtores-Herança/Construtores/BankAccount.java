package com.AllanRibeiro;

public class BankAccount {
    // Attributes
    private int accountNumber;
    private double balance;
    private String costumerName;
    private String email;
    private String phoneNumber;

    //Methods


    public BankAccount(int accountNumber, double balance, String costumerName,
                       String email, String phoneNumber) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.costumerName = costumerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double depositAmount){
        if (depositAmount >= 0){
            setBalance(getBalance() + depositAmount);
            System.out.println("Value added to account balance : " + depositAmount);
        }else {
            System.out.println("Invalid Value");
        }
    }

    public void withdrawl(double withdrawlAmount){
        if (withdrawlAmount > getBalance()){
            System.out.println("Cannot withdrawl this value, insufficiente balance");
        }else {
            setBalance(getBalance() - withdrawlAmount);
            System.out.println("Value removed from account : " + withdrawlAmount);
        }
    }


    //Gets and Sets
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
