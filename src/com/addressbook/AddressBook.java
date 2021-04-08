package com.addressbook;

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
	}

}
