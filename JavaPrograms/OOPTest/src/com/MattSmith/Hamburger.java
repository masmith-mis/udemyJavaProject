package com.MattSmith;

public class Hamburger {
    // The basic hamburger should have the following items.
    // bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    // the customer can select to be added to the burger. Each one of these items gets charged an additional
    // price so you need some way to track how many items got added and to calculate the price (for the base
    // burger and all the additions).
    //
    // This burger has a base price and the additions are all seperately priced.
    //
    // Create a Hamburger class to deal with all the above.
    //
    // The constructor should only include the roll type, meat and price.
    private String breadType;
    private String meat;
    private double price;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean onion;

    public Hamburger(String breadType, String meat) {
        this.breadType = breadType;
        this.meat = meat;
        this.price = 5.00;
    }

    //try addExtras method --

    public double addLettuce(boolean lettuce){
        double lettucePrice = 1.00;

        if(lettuce) {
            System.out.println("Current price is: " + price);
            System.out.println("Customer added lettuce. Additional charge is: " + lettucePrice);
            System.out.println("New price is: " + (price + lettucePrice));
            return price += lettucePrice;
        }
        System.out.println("Current price is: " + price);
        return price;
    }

    public double addTomato(boolean tomato){
        double tomatoPrice = 1.00;

        if(tomato) {
            System.out.println("Current price is: " + price);
            System.out.println("Customer added tomatoes. Additional charge is: " + tomatoPrice);
            System.out.println("New price is: " + (price + tomatoPrice));
            return price += tomatoPrice;
        }
        System.out.println("Current price is: " + price);
        return price;
    }

    public double addCarrot(boolean carrot) {
        double carrotPrice = 1.00;

        if(carrot){
            System.out.println("Current price is: " + price);
            System.out.println("Customer added carrots. Additional charge is: " + carrotPrice);
            System.out.println("New price is: " + (price + carrotPrice));
            return price += carrotPrice;
        }
        System.out.println("Current price is: " + price);
        return price;
    }

    public double addOnion(boolean onion){
        double onionPrice = 1.00;

        if(onion){
            System.out.println("Current price is: " + price);
            System.out.println("Customer added onions. Additional charge is: " + onionPrice);
            System.out.println("New price is: " + (price + onionPrice));
            return price += onionPrice;
        }
        System.out.println("Current price is: " + price);
        return price;
    }



    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isOnion() {
        return onion;
    }
}
