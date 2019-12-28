package com.revature.controller;

import java.util.Scanner;

import com.revature.model.UserModel;
import com.revature.service.Service;

public class Controller {
	
	
	//UserName Login Prompt
	public static String userNameLogin() {
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");
	    String temp = sc.nextLine();  // Read user input
	    UserModel.setUsername(temp); // Sets username from input
	    String user = UserModel.getUsername(); // Gets username from repository
	    
	    System.out.println("Username is: " + user);// Prints User Name
	    Service.printUsername();
	    return null;
	}
	
	//UserName Password Prompt
	public static String userPasswordLogin() {
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Password"); 
	    String temp = sc.nextLine();  // Read user input
	    UserModel.setPassword(temp);  //Sets password from input
	    String pwd = UserModel.getPassword(); // Gets password from repository
	    
	    System.out.println("Password Accepted");// Output user input
	    Service.printPassword();
	    return temp;
	}
	
	//Services 
	public static String ServiceRoutes() {
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    UserModel.printEqualsLine();
	    System.out.println("| What do you want to do? You can select...                                           |");
	    UserModel.printEqualsLine();
	    System.out.println("| View Balance |" + "Withdraw Money |" + "Deposit Money |" + "View All Transactions |" + " Transfer Money |");
	    UserModel.printEqualsLine();
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
	

	
	
	
}
