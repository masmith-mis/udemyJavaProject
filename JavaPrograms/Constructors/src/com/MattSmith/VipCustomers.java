package com.MattSmith;

public class VipCustomers {
    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomers() {
        this("Default Name", 50000.00, "default@email.com");
    }

    public VipCustomers(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomers(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
