package com.AllanRibeiro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayReverse = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(Arrays.toString(arrayReverse));
        reverse(arrayReverse);


    }

    public static void reverse(int[] array){
        int maxIndex = array.length;
        int[] arrayReversed = new int[array.length];

        for (int i = 0; i < arrayReversed.length; i ++){
                int last = array[maxIndex-1];
                int first = array[i];

                arrayReversed[i] = last;
                arrayReversed[maxIndex-1] = first;
                maxIndex--;
            }


        System.out.println(Arrays.toString(arrayReversed));
    }
}
