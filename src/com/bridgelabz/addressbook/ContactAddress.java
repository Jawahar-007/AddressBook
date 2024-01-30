package com.bridgelabz.addressbook;

public class ContactAddress {
    String Firstname;
    String Lastname;
    String Address;
    String City;
    int Zip;
    long Phnum;
    String Email;

    public ContactAddress(String firstname, String lastname, String address, String city, int zip, long phnum, String email) {
            Firstname = firstname;
            Lastname = lastname;
            Address = address;
            Zip = zip;
            Phnum = phnum;
            Email = email;
    }

    @Override
    public String toString() {
        return "ContactAddress{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Zip=" + Zip +
                ", Phnum=" + Phnum +
                ", Email='" + Email + '\'' +
                '}';
    }
}
