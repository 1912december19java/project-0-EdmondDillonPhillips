package com.revature.controller;

public class Controller {
	
	Boolean loggedIn; //login status
	String username; //username of user
	Integer password; //password of user
	String checkBalance; // checks to see if user wants to check balance
	
	
	
	//default constructor
	Controller(){
		super();
	}
	
	//constructor (overloading)
	Controller(Boolean loggedIn, String username, Integer password){
		this.loggedIn = loggedIn;
		this.username = username;
		this.password = password;
	}
	
	//if the user hits the login/logout route. Perform some logic
	
	//if the user hits the view balance route. Perform some logic.
	
	// IF a user hits the withdraw money route. Perform some logic.
	
	// If a user hits the deposit money route. Perform some logic.
	
	// If a user hits the view all transactions route. Perform some logic.
	
	// If a user hits the transfer money route. Perform some logic.
	
	
	
}
