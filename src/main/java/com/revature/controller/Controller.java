package com.revature.controller;

import java.util.Scanner;
import com.revature.exception.OverDraftException;
import com.revature.model.UserModel;
import com.revature.service.Services;

public class Controller {
	
	

	

	
	//Services 
	public static String ServiceRoutes() {
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    UserModel.printEqualsLine();
	    System.out.println("| What do you want to do? You can select...           |");
	    UserModel.printEqualsLine();
	    System.out.println("| View Balance |" + "Withdraw Money |" + "Deposit Money |" + "Logout |");
	    UserModel.printEqualsLine();
	    String temp = sc.nextLine();  // Read user input
	    
	    
		// If the user hits the view balance route. Perform some logic.
	    if(temp.contentEquals("View Balance")) {
	    	Services.viewAccountBalance();
	        Controller.ServiceRoutes();
	    }
		// IF a user hits the withdraw money route. Perform some logic.
	    else if(temp.contentEquals("Withdraw Money")) {
	    	try {
          Services.withdrawAmount();
        } catch (OverDraftException e) {
          System.out.println("You have insufficient funds.");
          MainUserInterface maininterface = new MainUserInterface();
          Controller.ServiceRoutes();
        }
	        Controller.ServiceRoutes();
	    }
		// If a user hits the deposit money route. Perform some logic.
	    else if(temp.contentEquals("Deposit Money")) {
	    	Services.depositMoney();
	        Controller.ServiceRoutes();
	    }
		// If a user hits the view all transactions route. Perform some logic.
	    else if(temp.contentEquals("View All Transactions")) {
	    	Services.transactionHistory();
	        Controller.ServiceRoutes();
	    }
		// If a user hits the transfer money route. Perform some logic.
	    else if(temp.contentEquals("Transfer Money")) {
	    	Services.moneyTransfer();
	        Controller.ServiceRoutes();
	    }else if(temp.contentEquals("Logout")){
	      Services.logout();
	    }
	    else {
	    	System.out.println("You entered wrong information.");
	        Controller.ServiceRoutes();
	    }
		
	    
	    
	    
	    return null;
	}
	

	
	
	
}
