package com.revature.service;

import com.revature.model.UserModel;


public class Service {
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
	}
	
	//simple print statement for deposit money
	
	public static void depositMoney() {
		System.out.println("Deposit Money logic goes here. ");
	}
	
	//simple print statement for registering
	
	public static void register() {
		System.out.println("You want to register logic");
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


