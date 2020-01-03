package com.revature.service;

import java.util.Scanner;
import org.apache.log4j.Logger;
import com.revature.controller.MainUserInterface;
import com.revature.exception.OverDraftException;
import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;


public class Services {
  
  private static Logger log = Logger.getLogger(Services.class);
  
	//simple print statement for login logout

    public static void printUsername() {
		System.out.println(UserModel.getUsername());
	}
	public static void printPassword() {
		System.out.println(UserModel.getPassword());
	}
	//simple print statement for view balance
	public static void viewAccountBalance() {
		System.out.println(UserModel.getBalance());
	}
	
	
	//simple print statement for withdraw money
	
	public static void withdrawAmount() throws OverDraftException{
	        
	        double tempbalance = UserModel.getBalance();

		    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	        System.out.println("Make an input"); 
	        double temp = sc.nextDouble();  // Read user input
	        if(temp > tempbalance || tempbalance < 0) {  // If user tries to overwithdraw
	          log.error("User has overdrawn");
	          throw new OverDraftException();
	        }
	        UserModel.setAmountWithdrawn(temp);
	        UserModel.setBalance();
	        UserModel.getBalance();
	        UserDaoPostgres user = new UserDaoPostgres();
	        user.update();
	}
	
	//simple print statement for deposit money generaly
	
	public static void depositMoney() {
	  System.out.println("How much would you like to deposit?");
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    double temp = sc.nextDouble();  // Read user input
		UserModel.setAmountAdded(temp);
		UserModel.setDepositBalance();
		UserModel.getDepositBalance();
		UserDaoPostgres user = new UserDaoPostgres();
		user.update();
		
	}
	
//simple print statement for deposit money generaly
    
    public static void depositMoneyOnRegister() {
      System.out.println("How much would you like to deposit?");
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        double temp = sc.nextDouble();  // Read user input
        UserModel.setAmountAdded(temp);
        UserModel.setDepositBalance();
//        UserModel.getDepositBalance();
//        UserDaoPostgres user = new UserDaoPostgres();
//        user.update();
        
    }
	
	//simple print statement for registering
	
	public static void register() {
		System.out.println("You want to register logic");
		
		UserModel user = new UserModel(null, null, 0);
	}
	
	//simple print statement for logging in
	
	public static void login() {
	  System.out.println("Login logic");
	}
	
	//simple print statement to view transaction history
	
	public static void transactionHistory() {
		System.out.println("View All Transactions Logic Goes Here. ");
	}
	
	//simple print statement to transfer money to another account
	
	public static void moneyTransfer() {
		System.out.println("Money Transfer Prompt");
	}
	
	//logout method
	public static void logout() {
	  String user = UserModel.getUsername();
	  UserModel.setUsername(null);
	  UserModel.setPassword(null);
	  UserModel.setInitialBalance();
	  log.info("The user " + user + " has logged out.");
	  
      MainUserInterface userinterface = new MainUserInterface();
      userinterface.promptUser();
	}
	
	
}


