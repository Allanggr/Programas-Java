package com.AllanRibeiro;

public class Main {

    public static void main(String[] args) {


        for (int i =2; i <= 8; i++){
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f",calculateInterest(10000.0, i)));
        }
        System.out.println("====================");
        for (int i =8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count = 0;

        for (int  i = 10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    private static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    private static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i =2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return  false;
            }
        }
        return true;
    }
}
