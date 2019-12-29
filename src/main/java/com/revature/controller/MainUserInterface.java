package com.revature.controller;

import java.util.Scanner;
import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;
import com.revature.service.CreatePassword;
import com.revature.service.CreateUserName;
import com.revature.service.Services;

public class MainUserInterface {
  
  
  
  

  public void promptUser() {

    
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Type Register or Login");
    String temp = sc.nextLine();  // Read user input
    
if(temp.contentEquals("Register")) {
  CreateUserName.userNameLogin();
  CreatePassword.userPasswordLogin();
  System.out.println("To start your account you need to deposit money.");
  Services.depositMoney();
  
  
}else if(temp.contentEquals("Login")) {
  String tempname = ReadInput.readInput();
  UserModel.setUsername(tempname);
  String temppswd = ReadInput.readInput();
  UserModel.setPassword(temppswd);

  System.out.println(UserModel.getUsername());
  System.out.println(UserModel.getPassword());
  
  UserDaoPostgres user = new UserDaoPostgres();
  user.get(tempname);
  
}else {
  MainUserInterface maininterface = new MainUserInterface();
  maininterface.promptUser();
}
//    UserModel.setPassword(temp);  //Sets password from input
//    String pwd = UserModel.getPassword(); // Gets password from repository
//    
//    System.out.println("Password Accepted");// Output user input
//    Services.printPassword();

  }
  
  

}
