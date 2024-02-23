package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<ContactAddress> contactsData;

    public AddressBook(ArrayList<ContactAddress> contactsData)
    {
        this.contactsData = contactsData;
    }

    Scanner scanner = new Scanner(System.in);

    public void menu() {

        String con;
         do{
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println(" Press 0 to exit ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addnewContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
            System.out.println(" Do you want to continue :(Y/N)");
            con = scanner.nextLine();
        }while(con.equalsIgnoreCase("n")|con.equalsIgnoreCase("N"));
    }
    public void addnewContact(){
        System.out.println("Enter Details \n Firstname \n lastname \n address \n city \n zip, \n phonenum \n email \n");
        String fname = scanner.next();
        String lname = scanner.next();
        String address = scanner.next();
        String city = scanner.next();
        int zip = scanner.nextInt();
        long phnum = scanner.nextLong();
        //consume the newline character left in the buffer
        //scanner.nextLine();
        String email = scanner.next();
        //boolean isDuplicate = contactsData.stream().anyMatch(contactAddress -> contactAddress.getFirstName().equalsIgnoreCase(fname));
        // used stream to find the duplicate of the firstname without case-sensitive
        //if(isDuplicate)
        //    System.out.println("Entry already exists. No Duplicate Entry is allowed .");
            // no dulpicate entry then fname gets added to the contactaddress constructor at COntactAddress class.
        //else{
            ContactAddress obj1 = new ContactAddress(fname, lname, address, city, zip, phnum, email);
            System.out.println(obj1);
            System.out.println("Contact added Successfully");
        }

    public void editContact() {
        System.out.println("Enter the First name to edit the contacts:");
        String firstname = scanner.nextLine();
        for (ContactAddress contact : contactsData ) {
            if (contact.getFirstName().equalsIgnoreCase(firstname)) {
                System.out.println("Editing Contacts" + contact);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter your details \n Firstname \n lastname \n address \n city \n zip, \n phonenum \n email \n ");
                contact.setFirstname(scanner1.nextLine());
                contact.setLastName(scanner1.nextLine());
                contact.setAddress(scanner1.nextLine());
                scanner.nextLine();
                contact.setCity(scanner1.nextLine());
                contact.setZip(scanner1.nextInt());
                contact.setPhoneNum(scanner1.nextLong());
                contact.setEmail(scanner1.nextLine());
                System.out.println("Contact edited successfully.");
            }
        }
    }
    public void deleteContact() {
        System.out.println("Enter the fname to delete:");
        Scanner scanner4 = new Scanner(System.in);
        String Conctodelete = scanner4.nextLine();

        boolean contactFound = false;
        for (ContactAddress contact : contactsData) {
            if (contact.getFirstName().equalsIgnoreCase(Conctodelete)) {
                contactsData.remove(contact);
                contactFound = true;
                System.out.println("Contact Deleted");
                System.out.println();
                break;
            }
        }
        if(!contactFound)
            System.out.println("Contact not list with given First name");
    }
}
