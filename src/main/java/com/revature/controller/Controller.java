package com.revature.controller;

import java.util.Scanner;

import com.revature.repository.Repository;
import com.revature.service.Service;

public class Controller {
	
//	Boolean loggedIn; //login status
//	static String username; //username of user
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
	
	
	//UserName Login Prompt
	public static String userNameLogin() {
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");
	    String temp = sc.nextLine();  // Read user input
	    Repository.setUser(temp); // Sets username from input
	    String user = Repository.getUser(); // Gets username from repository
	    
	    System.out.println("Username is: " + user);// Prints User Name
	    
	    return null;
	}
	
	//UserName Password Prompt
	public static String userPasswordLogin() {
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Password"); 
	    String temp = sc.nextLine();  // Read user input
	    Repository.setPassword(temp);  //Sets password from input
	    String user = Repository.getPassword(); // Gets 
	    
	    System.out.println("Password Accepted");// Output user input
	    
	    return null;
	}
	
	//UserName Password Prompt
	public static String ServiceRoutes() {
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("What do you want to do? You can select...");
	    System.out.println("View Balance " + "Withdraw Money " + "Deposit Money " + "View All Transactions " + " Transfer Money");
	    String temp = sc.nextLine();  // Read user input
	    
	    
		// If the user hits the view balance route. Perform some logic.
	    if(temp.contentEquals("View Balance")) {
	    	Service.viewAccountBalance();
	    }
		// IF a user hits the withdraw money route. Perform some logic.
	    else if(temp.contentEquals("Withdreaw Money")) {
	    	Service.withdrawAmount();
	    }
		// If a user hits the deposit money route. Perform some logic.
	    else if(temp.contentEquals("Deposit Money")) {
	    	Service.depositMoney();
	    }
		// If a user hits the view all transactions route. Perform some logic.
	    else if(temp.contentEquals("View All Transactions")) {
	    	Service.transactionHistory();
	    }
		// If a user hits the transfer money route. Perform some logic.
	    else if(temp.contentEquals("Transfer Money")) {
	    	Service.moneyTransfer();
	    }
	    else {
	    	System.out.println("You entered wrong information.");
	    }
		
	    
	    
	    
	    return null;
	}
	

//	public static void sampleControllerPrint() {
//		System.out.println("Hello from the Controller! This is another go. Discovery.");
//		int username = Repository.getUser();
//	}

	
	// User is prompted to login
	// When logged in go to while loop that will loop over the controller
	
	
	
	
	
}
