package com.revature.service;

import java.util.Scanner;
import com.revature.model.UserModel;

public class CreateUserName {
  //UserName Login Prompt
  public static String userNameLogin() {
      Scanner sc = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter username");
      String temp = sc.nextLine();  // Read user input
      UserModel.setUsername(temp); // Sets username from input
      String user = UserModel.getUsername(); // Gets username from repository
      
      System.out.println("Username is: " + user);// Prints User Name
      Services.printUsername();
      return user;
  }
}
