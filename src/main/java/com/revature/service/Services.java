package com.revature.service;

import java.util.Scanner;
import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;


public class Services {
  
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
	
	public static void withdrawAmount() {
		System.out.println("Withdraw money logic goes here. ");
	      Scanner sc = new Scanner(System.in);  // Create a Scanner object
	        System.out.println("Make an input"); 
	        double temp = sc.nextDouble();  // Read user input
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
	
	
}


