package com.AllanRibeiro;

public class Main {

    public static void main(String[] args) {
        
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        

        double numberOfPounds = 200d;
        double kilograms = numberOfPounds * 0.453_592_37d;
        System.out.println(kilograms + "kg");
    }
}
