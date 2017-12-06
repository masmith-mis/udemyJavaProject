package com.MattSmith;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myMinTotal = (myMinValue/2);
        int myMaxTotal = (myMaxValue/2);
        System.out.println("myMinTotal = " + myMinTotal);
        System.out.println("myMaxTotal = " + myMaxTotal);


        //byte has a width of 8
        //used to save memory:
        //-128 -> 127
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        //-32768 -> 32767
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        //long has a width of 64
        //double the width of an integer
        long myLongValue = 100L;
        long myNewLongValue = (myLongValue/2);
        System.out.println("myNewLongValue = " + myNewLongValue);

        //Exercise:
        byte newByte = 10;
        short newShort = 20;
        int newInt = 50;
        long newLong = 50000L + 10L * (newByte + newShort + newInt);
        short shortTotal = (short) (1000 + 10 * (newByte + newShort + newInt));
        System.out.println("Long Total: = " + newLong);
        System.out.println("Short Total: = " + shortTotal);

    }
}
