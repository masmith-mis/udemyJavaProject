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
//        Account mattsAccount = new Account("12345", 0, "Matt", "matt@gmail.com", "8178971008");
//
//        mattsAccount.depositFunds(50);
//        mattsAccount.withdrawFunds(140);
//
//        mattsAccount.depositFunds(100);
//        mattsAccount.withdrawFunds(149);
//
//        mattsAccount.withdrawFunds(1);

        // Create a new class VIPCustomer
        // it should have 3 fields name, credit limit, and email address
        // create 3 constructors
        // 1st constructor empty should call the constructor wtih 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields
        // create getters only for this using code generation (setters won't be needed)
        // test and confirm it works.

        VipCustomers stefsAccount  = new VipCustomers();
        System.out.println(stefsAccount.getName());
        System.out.println(stefsAccount.getCreditLimit());
        System.out.println(stefsAccount.getEmail());

        VipCustomers timsAccount = new VipCustomers("Tim", 20000);
        System.out.println(timsAccount.getName());
        System.out.println(timsAccount.getCreditLimit());
        System.out.println(timsAccount.getEmail());

        VipCustomers mattsAccount = new VipCustomers("Matt", 30000, "matt@gmail.com");
        System.out.println(mattsAccount.getName());
        System.out.println(mattsAccount.getCreditLimit());
        System.out.println(mattsAccount.getEmail());

    }
}
