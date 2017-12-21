package com.MattSmith;

public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public Account() {
        this("56789", 0, "Default Name", "Default address", "default phone");
        System.out.println("Empty constructor called");

    }

    public Account(String accountNumber, double balance, String customerName, String customerEmail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String customerEmail, String phoneNumber) {
        this("9999", 100.55, customerName, customerEmail, phoneNumber);
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Funds have been added. Your current balance is " + balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
