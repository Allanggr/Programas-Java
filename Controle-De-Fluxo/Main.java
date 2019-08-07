package com.AllanRibeiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while(true){
            System.out.println("Enter number #" + (count+1));

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                count++;

                if(count== 10){
                    break;
                }
            }else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();

        }

        System.out.println("The sum of the 10 numbers is " + sum);
        scanner.close();



    }


}


