package com.revature.controller;

import java.util.Scanner;
import com.revature.model.UserModel;
import com.revature.service.Services;

public class ReadInput {
  
  public static String readInput() {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Make an input"); 
    String temp = sc.nextLine();  // Read user input
    
    return temp;
  }

}
