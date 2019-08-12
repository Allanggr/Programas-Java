package com.AllanRibeiro;

import java.util.Scanner;

public class Main {


    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Type the leght of the array \r");
        int count = scanner.nextInt();

        int[] array = readIntegers(count);
        System.out.println("Minimum number : " + findMin(array));

    }

    public static int[] readIntegers(int count){
        int[] myIntegers = new int[count];
        System.out.println("Enter " + count + " of Integers values.\r");

        for (int i =0; i < myIntegers.length; i++){
            myIntegers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return myIntegers;
    }

    public static int findMin(int[] array) {
        int min = 0;

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] < array[i + 1]) {
                min = array[i];
                array[i+1] = min;
            }
        }
        return min;
    }
}
