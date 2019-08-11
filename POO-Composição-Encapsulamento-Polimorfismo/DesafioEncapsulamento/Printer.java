package com.AllanRibeiro;

import sun.nio.cs.ext.MacArabic;

public class Printer {

    private int tonerLevel;
    private int numberOfPages;
    private boolean duplexPrinter;
    private int pagesPrinted;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.duplexPrinter = duplexPrinter;
        this.numberOfPages = 0;
        this.pagesPrinted = 0;
    }

    public int fill(int amount){
        int sum = this.tonerLevel + amount;
        if(sum > 100){
            System.out.println("TONER LEVEL REACHED MAXIMUM! FILL THE REQUIRED " +
                                "AMOUNT!");
            return -1;
        }else {
            this.tonerLevel += amount;
            return this.tonerLevel;
        }
    }

    public void print(int pages) {
        this.numberOfPages = pages;
        if (duplexPrinter) {
            numberOfPages = (this.numberOfPages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
            this.tonerLevel -= numberOfPages;
        }
        this.pagesPrinted += numberOfPages;
        this.tonerLevel -= numberOfPages;
    }


    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}
