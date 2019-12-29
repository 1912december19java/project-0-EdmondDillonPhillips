package com.revature.service;

import com.revature.model.UserModel;


public class Services {
	//simple print statement for login logout
	
	
	private static final String String = null;

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
	}
	
	//simple print statement for deposit money
	
	public static void depositMoney() {
	  System.out.println("How much would you like to deposit?");
		System.out.println("Deposit Money logic goes here. ");
	}
	
	//simple print statement for registering
	
	public static void register() {
		System.out.println("You want to register logic");
		
		UserModel user = new UserModel(null, null, 0, false);
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


