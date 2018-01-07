package com.MattSmith;

public class Main {

    public static void main(String[] args) {

//        Account bobsAccount = new Account();
//        Account mattsAccount = new Account(1234, 0, "Matt", "matt@gmail.com", "817-897-1008");
//        mattsAccount.withdrawal(100);
//        mattsAccount.deposit(50);
//        mattsAccount.withdrawal(100);
//        mattsAccount.deposit(51);
//        mattsAccount.withdrawal(100);
//
//        Account stefsAccount = new Account("Stef", "stef@email.com", "12345");
//        System.out.println(stefsAccount.getNumber() + " name: " + stefsAccount.getName());

        VipCustomer matt = new VipCustomer();
        System.out.println("Name: " + matt.getName()
                + "\n" + "Credit Limit: " + matt.getCreditLimit()
                + "\n" + "Email: " + matt.getEmail());

        VipCustomer stef = new VipCustomer("Stefanie", 10000);
        System.out.println("Name : " + stef.getName()
                + "\n" + "Credit Limit: " + stef.getCreditLimit()
                + "\n" + "Email: " + stef.getEmail());

        VipCustomer jason = new VipCustomer("Jason", 50000, "jason@gmail.com");
        System.out.println("Name: " + jason.getName()
                + "\n" + "Credit Limit: " + jason.getCreditLimit()
                + "\n" + "Email: " + jason.getEmail());
    }
}
