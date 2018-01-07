package com.MattSmith;

public class Account {
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {
        this(9999, 0.00, "Default Customer Name", "default@email.com", "Default Phone Number");
        System.out.println("Empty constructor called. Using default values. "
                + "\n" + "Account Number: " + getNumber()
                + "\n" + "Account Balance: " + getBalance()
                + "\n" + "Customer Name: " + getName()
                + "\n" + "Customer Email: " + getEmail()
                + "\n" + "Customer Phone Number: " + getPhoneNumber());
    }

    public Account(String name, String email, String phoneNumber) {
        this(9999, 100.55, name, email, phoneNumber);
    }

    public Account(int number, double balance, String name, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public double deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " New balance = " + this.balance);
        return this.balance;
    }

    public double withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount >= 0){
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " Remaining balance = " + this.balance);
        } else {
            System.out.println("Insufficient funds available. Withdrawal not processed. Account balance: " + this.balance);
        }
        return this.balance;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
