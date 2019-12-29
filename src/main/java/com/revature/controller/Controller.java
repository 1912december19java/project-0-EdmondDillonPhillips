package com.revature.controller;

import java.util.Scanner;

import com.revature.model.UserModel;
import com.revature.service.Services;

public class Controller {
	
	

	

	
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
	    	Services.viewAccountBalance();
	    }
		// IF a user hits the withdraw money route. Perform some logic.
	    else if(temp.contentEquals("Withdreaw Money")) {
	    	Services.withdrawAmount();
	    }
		// If a user hits the deposit money route. Perform some logic.
	    else if(temp.contentEquals("Deposit Money")) {
	    	Services.depositMoney();
	    }
		// If a user hits the view all transactions route. Perform some logic.
	    else if(temp.contentEquals("View All Transactions")) {
	    	Services.transactionHistory();
	    }
		// If a user hits the transfer money route. Perform some logic.
	    else if(temp.contentEquals("Transfer Money")) {
	    	Services.moneyTransfer();
	    }
	    else {
	    	System.out.println("You entered wrong information.");
	    }
		
	    
	    
	    
	    return null;
	}
	

	
	
	
}
