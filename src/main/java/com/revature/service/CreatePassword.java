package com.revature.service;

import java.util.Scanner;
import com.revature.model.UserModel;

public class CreatePassword {
  //UserName Password Prompt
  public static String userPasswordLogin() {
      Scanner sc = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter Password"); 
      String temp = sc.nextLine();  // Read user input
      UserModel.setPassword(temp);  //Sets password from input
      String pwd = UserModel.getPassword(); // Gets password from repository
      
      System.out.println("Password Accepted");// Output user input
      Services.printPassword();
      return temp;
  }
}
