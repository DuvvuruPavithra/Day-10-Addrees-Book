package com.bridgelabz.addressbook;

import java.util.Collection;
import java.util.Scanner;

public class AddressBookUc5 {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private long phoneNo;
	private String email;
	
	
	 public AddressBookUc5(String firstName,String lastName,String address,String city,int zipcode,String state,long phoneNo,String email) {
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.address = address;
		 this.city = city;
		 this.zipcode = zipcode;
		 this.state = state;
		 this.phoneNo = phoneNo;
		 this.email = email;
	 }
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", zipcode=" + zipcode + ", state=" + state + ", phoneNo=" + phoneNo + ", email=" + email
				+ "]";
	}


	
	public static void main(String[] args) {
		CollectionClass collection = new CollectionClass();
		int result;
		int choice;
		do {
			System.out.println("Enter the choice : ");
			System.out.println("1.Add ");
			System.out.println("2.Display");
			System.out.println("3.Edit");
			System.out.println("4.Delete");
			Scanner sc = new Scanner(System.in);
			 choice= sc.nextInt();
			
			switch(choice) {
			case 1: 
				collection.addData();
				break;
			case 2:
				collection.displayContactsData();
				break;
			case 3:
				collection.editData();;
				break;
			case 4:
				collection.deleteData();
				break;

			}System.out.println("Do you want to continue then press '1' ");
			 result = sc.nextInt();
			}while(result==1);

	}

}
