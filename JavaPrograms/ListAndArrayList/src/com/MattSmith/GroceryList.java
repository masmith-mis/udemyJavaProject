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

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //print the grocery list
    public void printGroceryList() {
        //size will return how many elements are stored in the ArrayList
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    //modify your list
    private void modifyGroceryItem(int position, String newItem) {
        //replaces that item in the position
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    //remove an item
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    //query the ArrayList (GroceryList) to find an item
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
