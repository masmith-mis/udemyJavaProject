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

        //new Account() - this is calling the constructor.
        Account stefsAccount = new Account();
        Account mattsAccount = new Account("12345", 0.00, "Matt Smith", "matt@gmail.com", "(817)897-1008");
        Account timsAccount = new Account("Tim", "Tim@email.com", "12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
//        System.out.println(stefsAccount.getNumber());
//        System.out.println(stefsAccount.getBalance());
//
//        System.out.println(mattsAccount.getNumber());
//        System.out.println(mattsAccount.getCustomerName());
//        System.out.println(mattsAccount.getBalance());
//        System.out.println(mattsAccount.getCustomerEmailAddress());
//        System.out.println(mattsAccount.getCustomerPhoneNumber());


        mattsAccount.withdrawal(100.00);

        mattsAccount.deposit(50.00);
        mattsAccount.withdrawal(100.00);

        mattsAccount.deposit(51.00);
        mattsAccount.withdrawal(101.00);

        //Create a new class called VipCustomer
        //it should have 3 fields name, credit limit, and email address.
        //create 3 constructors.
        //1st constructor empty should call the constructor with 3 parameters with default values
        //2nd constructor should pass on the 2 values it receives and add a default for the 3rd
        //3rd constructor should save all fields.
        //create getters only for this using code generation of intellij as setters wont be needed
        //test and confirm it works.

//        VipCustomers mattsAccount = new VipCustomers();
//        System.out.println("Name: " + mattsAccount.getName() + " Credit Limit: " + mattsAccount.getCreditLimit() + " Email: " + mattsAccount.getEmailAddress());
//
//        VipCustomers timsAccount = new VipCustomers("tim", 60000.00);
//        System.out.println("Name: " + timsAccount.getName() + " Credit Limit: " + timsAccount.getCreditLimit() + " Email: " + timsAccount.getEmailAddress());
//
//        VipCustomers stefaniesAccount = new VipCustomers("stefanie", 80000.00, "stef@gmail.com");
//        System.out.println("Name: " + stefaniesAccount.getName() + " Credit Limit: " + stefaniesAccount.getCreditLimit() + " Email: " + stefaniesAccount.getEmailAddress());



    }
}
