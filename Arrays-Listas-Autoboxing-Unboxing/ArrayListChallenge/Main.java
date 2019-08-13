package com.AllanRibeiro;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static  MobilePhone mobilePhone = new MobilePhone("0048 586 478");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nENTER ACTIONS: (6 TO SHOW AVALIABLE ACTIONS)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContat();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }



    }

    private static void addNewContat(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        }else
            System.out.println("Cannot add, " + name + " already in file");

    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Sucessfully updated record");
        }else{
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Sucessfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + "phone number is" +
                            existingContactRecord.getPhoneNumber());

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Sucessfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }
    }


    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("\nAvaliable actions:\npress");
        System.out.println("0 - TO SHUTDOWN\n" +
                            "1 - TO PRINT CONTACTS\n" +
                            "2 - TO ADD A NEW CONTACT\n" +
                            "3 - TO  UPDATE AN EXISTING CONTACT\n" +
                            "4 - TO REMOVE AN EXISTING CONTACT\n" +
                            "5 - TO QUERY IF AN EXISTING CONTACT EXIST\n" +
                            "6 - TO PRINT A LIST OF AVALIABLE ACTIONS.");
        System.out.print("choose your action: ");
    }
}
