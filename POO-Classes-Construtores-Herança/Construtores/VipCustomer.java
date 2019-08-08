package com.AllanRibeiro;
public class VipCustomer {
    //Attributes
    private String name;
    private double creditLimit;
    private String email;


    //Constructors

    public  VipCustomer() {
        this("Defaul name", 50000.00, "Default@gmail.com");
    }

    public VipCustomer(String name,double creditLimit) {
        this(name,creditLimit, "allan@hotmail.com");
    }


    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //getters

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
