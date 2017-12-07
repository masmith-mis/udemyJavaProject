package com.MattSmith;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account (See Account.java)
        // Create fields for the account number, balance, customer name, email, and phone number (Account.java)
        //
        // Create getters and setters for each field (Account.java)
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field.
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account mattsAccount = new Account("12345", 0.00, "Matt Smith", "matt@gmail.com", "(817)897-1008");
        System.out.println(mattsAccount.getNumber());
        System.out.println(mattsAccount.getCustomerName());


        mattsAccount.withdrawal(100.00);

        mattsAccount.deposit(50.00);
        mattsAccount.withdrawal(100.00);

        mattsAccount.deposit(51.00);
        mattsAccount.withdrawal(100.00);



    }
}
