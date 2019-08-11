package com.AllanRibeiro;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,false);

        System.out.println("toner level: " + printer.getTonerLevel());
        printer.fill(0);
        System.out.println("toner level: " + printer.getTonerLevel());
        printer.print(21);
        System.out.println("Pages Printed : " + printer.getPagesPrinted());
        System.out.println("toner level: " + printer.getTonerLevel());
    }
}
