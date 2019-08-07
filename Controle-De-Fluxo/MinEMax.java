package com.AllanRibeiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        boolean first = true;

        while (true){
            System.out.println("Enter number.");

            boolean isValid = scanner.hasNextInt();

            if (isValid){
                int number = scanner.nextInt();


                if(number > maximum){
                    maximum = number;
                }else if (number < minimum){
                    minimum = number;
                }

            }else
            {
                break;
            }

            scanner.nextLine();

        }

        System.out.println("Maximum value: " + maximum + " Minimum value: " + minimum);
        scanner.close();
    }
}


