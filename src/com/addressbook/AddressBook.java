package com.addressbook;
import java.util.*;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Wellcome To Address Book Program... ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FirstName :");
		String firstName = sc.next();
		System.out.println("Enter LastName :");
		String lastName = sc.next();
		System.out.println("Enter Address :");
		String address = sc.next();
		System.out.println("Enter City :");
		String city = sc.next();
		System.out.println("Enter State :");
		String state = sc.next();
		System.out.println("Enter Zip :");
		String zip = sc.next();
		System.out.println("Enter Phone Number :");
		String phoneNumber = sc.next();
		System.out.println("Enter Email ID :");
		String email = sc.next();
		Contact c = new Contact(firstName, lastName, address, city, state, 0, 0, email);
		//Add Contact
		 LinkedList<String> s = new LinkedList<String>();
		s.add(firstName);
		s.add(lastName);
		s.add(address);
		s.add(city);
		s.add(state);
		s.add(zip);
		s.add(phoneNumber);
		s.add(email);
		System.out.println("Address Book Have A Contact:"+c);
		
		
	}

}
