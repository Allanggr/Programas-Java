package com.AllanRibeiro;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " Integer values.\n");

        for (int x = 0; x < array.length; x++){
            array[x] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){

        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i ++){
            sortedArray[i] = array[i];
        }
        boolean flag =true;
        int temp;

        while (flag){
            flag = false;
            for(int x = 0; x < sortedArray.length -1; x++){
                if(sortedArray[x] < sortedArray[x +1]) {
                    temp = sortedArray[x];
                    sortedArray[x] = sortedArray[x + 1];
                    sortedArray[x + 1] = temp;
                    flag = true;
                }

            }
        }
        return sortedArray;
    }

}
