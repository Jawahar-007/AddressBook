package com.bridgelabz.addressbook;

public class AddressBook {
    public static void main(String args[]){
        System.out.println("Welcome To Address Book");
        ContactAddress obj = new ContactAddress("Jawahar","B","Thiruporur Road","Chennai",500004,6197656412L,"xyz@gmail.com");
        System.out.println(obj.Firstname);
        System.out.println(obj.Phnum);
    }
}

