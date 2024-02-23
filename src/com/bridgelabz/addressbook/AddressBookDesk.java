package com.bridgelabz.addressbook;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class AddressBookDesk {
    static Map<String, ArrayList<ContactAddress>> books = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String con;
        System.out.println("Welcome to Address Book Desk ");
       do {
            System.out.println("Enter your Choice");
            System.out.println(" 1) New Address Book \n 2) Existing Book ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createnewBook();
                    break;
                case 2:
                    existingBook();
                    break;
                default:
                    System.out.println("Invalid Option");
            }
           System.out.println("Do you want to COntinue:(Y/N) ");
            con = scanner.next();
        }while (con.equalsIgnoreCase("n")|con.equalsIgnoreCase("N"));
    }

    public static void createnewBook() {
        System.out.println("Enter the new name :");
        String newName = scanner.next();
        books.put(newName, new ArrayList<>());
        System.out.println("Address Book " + newName + " Created.");
    }
    public static void existingBook(){
        System.out.println("Enter the address book name to search :");
        String addressBookName = scanner.next();
        if(books.containsKey(addressBookName)) {
            AddressBook addressBook = new AddressBook(books.get(addressBookName));
            addressBook.menu();
        }else
            System.out.println("Address Book : "+addressBookName + " Not Existing");
    }
}





