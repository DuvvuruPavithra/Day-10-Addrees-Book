package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionClass {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private long phoneNo;
	private String email;
	
	static ArrayList<AddressBookUc5> contactBook = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public void addData() {
		System.out.println("Enter the first name : ");
		firstName = sc.next();
		System.out.println("Enter the last name : ");
		lastName = sc.next();
		System.out.println("Enter the address : ");
		address = sc.next();
		System.out.println("Enter the city : ");
		city = sc.next();
		System.out.println("Enter the state : ");
		state = sc.next();
		System.out.println("Enter the zip code : ");
		zipcode = sc.nextInt();
		System.out.println("Enter the phone number : ");
		phoneNo = sc.nextLong();
		System.out.println("Enter the email : ");
		email = sc.next();
		AddressBookUc5 addressbook = new AddressBookUc5(firstName , lastName , address , city , zipcode , state , phoneNo , email);
  		contactBook.add(addressbook);
  		System.out.println("\nContact added Successfully.");
	}
	
	
public void editData() {
		
		System.out.println("\nEnter first name to edit :- ");
		String searchName = sc.next();
		for(int i = 0 ; i < contactBook.size() ; i++) {
			if(contactBook.get(i).getFirstName().equals(searchName)) {
				int result;
				do {
				    System.err.println("\nChose the  option to edit ");
					System.out.print("\n1.First Name \n2.Last Name \n3.Address \n4.City \n5.State \n6.Zipcode \n7.Phone Number \n8.Email Id :- ");
					int modify = sc.nextInt();
					switch(modify) {
					case 1:
						System.out.print("Enter new First Name :- ");
						contactBook.get(i).setFirstName(sc.next());
						System.out.print("First name is updated successfully :- ");
						break;
					case 2:
						System.out.print("Enter new Last Name :- ");
						contactBook.get(i).setLastName(sc.next());
						System.out.print("Last name is updated successfully :- ");

						break;
					case 3:
						System.out.print("Enter new Address :- ");
						contactBook.get(i).setAddress(sc.next());
						System.out.print("Address  is updated successfully :- ");

						break;
					case 4:
						System.out.print("Enter new City :- ");
						contactBook.get(i).setCity(sc.next());
						System.out.print("City is updated successfully :- ");

						break;
					case 5:
						System.out.print("Enter new State :- ");
						contactBook.get(i).setState(sc.next());
						System.out.print("State  is updated successfully :- ");
						break;
					case 6:
						System.out.print("Enter new Zipcode :- ");
						contactBook.get(i).setZipcode(sc.nextInt());
						System.out.print("Zipcode is updated successfully :- ");

						break;
					case 7:
						System.out.print("Enter new PhoneNumber :- ");
						contactBook.get(i).setPhoneNo(sc.nextLong());
						System.out.print("Mobile Number is updated successfully :- ");

						break;
					case 8:
						System.out.print("Enter new Email Id :- ");
						contactBook.get(i).setEmail(sc.next());
						System.out.print("Email Id is updated successfully :- ");
						break;
					}
					System.out.println("Enter 1 if you want to continue");
					result = sc.nextInt();
			}while(result == 1);
			}
			else
				System.out.println("Please enter the correct first name");
		}

	}
	
	public void deleteData() {
		System.out.println("\nEnter first name to delete : ");
		String searchName = sc.next();
		for(int i=0;i<contactBook.size();i++) {
			if(contactBook.get(i).getFirstName().equals(searchName)) {
				contactBook.remove(i);
				System.out.println("deleted");
			}
			else {
				System.out.println("not deleted");
			}
		}
	}
	
	public void displayContactsData() {
		int i;
		System.out.println("\nContacts Present in Address Book:");
		for(i = 0 ; i < contactBook.size() ; i++) {
			System.out.println(contactBook.get(i));
		}
	}
}
