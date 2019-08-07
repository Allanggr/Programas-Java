package com.AllanRibeiro;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " +result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result ++;
        System.out.println("Result is now " + result);
        

        double firstVar = 20d;
        double secondVar = 80d;

        double total = ((firstVar + secondVar) * 25d) % 40d;

        if(total <= 20)
            System.out.println("Total was over the limit");;

    }
}
