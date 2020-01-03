package com.revature.controller;

import java.util.Scanner;
import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;
import com.revature.service.CreatePassword;
import com.revature.service.CreateUserName;
import com.revature.service.RegisterUser;
import com.revature.service.Services;
import com.revature.service.UserLogin;
import org.apache.log4j.Logger;


public class MainUserInterface {
  private static Logger log = Logger.getLogger(UserDaoPostgres.class);

  
  public void promptUser() {

    
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Type Register or Login");
    String temp = sc.nextLine();  // Read user input
    
if(temp.contentEquals("Register")) {
  log.info("User has tried to register.");
  RegisterUser.registerUser();
  
}else if(temp.contentEquals("Login")) {
  UserLogin.userLogin();
}else {
  
  System.out.println("Try Again");
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
