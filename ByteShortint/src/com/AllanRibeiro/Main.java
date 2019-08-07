package com.AllanRibeiro;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        /*int myMinValue= -2_147_483_648;
	    int myMaxValue= 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

	    // byte has widht of 8
	    byte myByteValue= -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

	    // short has a width of 16
	    short myShortValue= 32767;
	    short myNewShortValue= (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

	   // long has a width of 64
        long myLongValue = -9_223_372_036_854_775_807L;
        */

        byte byteVariable= 20;

        short shortVariable= 2000;

        int intVariable= 2_000_000;

        long longVariable= 50_000 + 10 *( byteVariable + shortVariable + intVariable);

        System.out.println("Longtotal = " + longVariable);

    }
}
