package com.MattSmith;

import java.util.ArrayList;

public class GroceryList {

    //defining a new ArrayList
    private ArrayList<String> groceryList = new ArrayList<String>();

    //create a function to add a grocery item
    //has a parameter of item
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    //print the grocery list
    public void printGroceryList() {
        //size will return how many elements are stored in the ArrayList
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + " . " + groceryList.get(i));
        }
    }

    //modify your list
    public void modifyGroceryItem(int position, String newItem) {
        //replaces that item in the position
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified.");
    }

    //remove an item
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    //query the ArrayList to find an item
    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
