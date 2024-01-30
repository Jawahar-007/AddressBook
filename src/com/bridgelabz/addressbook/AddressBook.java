package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    public static void main(String args[]){
        System.out.println("Welcome To Address Book");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Details \n Firstname \n lastname \n address \n city \n zip, \n phonenum \n email \n");
        String fname = scanner.nextLine();
        String lname = scanner.nextLine();
        String address = scanner.nextLine();
        String city = scanner.nextLine();
        int zip = scanner.nextInt();
        long phnum = scanner.nextLong();
        //consume the newline character left in the buffer
        String email = scanner.nextLine();
        ContactAddress obj1 = new ContactAddress(fname,lname,address,city,zip,phnum,email);
        System.out.println(obj1);

    }
}

