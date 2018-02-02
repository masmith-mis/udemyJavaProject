package com.MattSmith;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    //Method to add new contact:
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }

        //add to the list of records
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }

        //update array list
        //replaces the old record with the new one
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() +", was replaced with " + newContact.getName());
        return true;
    }

    //sent a contact record
    //if on file, return the contact name
    //else return null, its not on file it does not exist
    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }

        return null;
    }

    //remove contact:
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
    }

    //return integer
    private int findContact(Contact contact) {
        //returns an integer showing us what the element position is
        //in the array for that contact object
        //the number returned will be 0 or greater if it exists
        //or less than 0 if it doesn't exist.
        return this.myContacts.indexOf(contact);

    }

    private int findContact(String contactName) {
        //loop through all the records. extract the name out.
        //compare that to the name that's been passed.
        //and return the index position if its actually on file
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        //contact was not found, return -1
        return -1;
    }
}
