package com.MattSmith;

public class Main {

    public static void main(String[] args) {
        //can only be one character
        //always start with backslash u
        //width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println(myChar);

        //true or false
        boolean myBoolean = false;
        boolean isMale = true;

        //register symbol
        char myRegisterSymbol = '\u00AE';
        System.out.println(myRegisterSymbol);
    }
}
