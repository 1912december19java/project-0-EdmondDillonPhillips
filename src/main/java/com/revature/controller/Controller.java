package com.revature.controller;

import java.util.Scanner;

import com.revature.repository.Repository;

public class Controller {
	
//	Boolean loggedIn; //login status
//	String username; //username of user
//	Integer password; //password of user
//	String checkBalance; // checks to see if user wants to check balance
//	
//	
//	
//	//default constructor
//	public Controller(){
//		super();
//	}
//	
//	//constructor (overloading)
//	Controller(Boolean loggedIn, String username, Integer password){
//		this.loggedIn = loggedIn;
//		this.username = username;
//		this.password = password;
//	}
	
	public static String userLogin() {
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");
	    String userName = sc.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input
	    
	    return null;
	}
	
	

	public static void sampleControllerPrint() {
		System.out.println("Hello from the Controller! This is another go. Discovery.");
		Repository.sampleRepositoryPrint();
	}

	
	// User is prompted to login
	// When logged in go to while loop that will loop over the controller
	
	// while loop 
	
	// If the user hits the view balance route. Perform some logic.
	
	// IF a user hits the withdraw money route. Perform some logic.
	
	// If a user hits the deposit money route. Perform some logic.
	
	// If a user hits the view all transactions route. Perform some logic.
	
	// If a user hits the transfer money route. Perform some logic.
	
	
	
}
