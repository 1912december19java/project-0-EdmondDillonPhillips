package com.revature.service;

import com.revature.controller.Controller;
import com.revature.controller.ReadInput;
import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;

public class UserLogin {
  
  public static void userLogin() {
    UserModel.setUsername(null);
    UserModel.setPassword(null);
    UserModel.setInitialBalance();
    
    String tempname = ReadInput.readInput("Type Your Username");//Asks for username and saves to 'tempname'
    UserModel.setUsername(tempname);                            //Sets username in UserModel
    String temppswd = ReadInput.readInput("Type Your Password");//Asks for password and saves to 'temppswd'
    UserModel.setPassword(temppswd);                            //Sets password in UserModel
    
    //*Zombie Code*
//    System.out.println("After user input");
//    System.out.println(UserModel.getUsername());
//    System.out.println(UserModel.getPassword());
    //*Zombie Code*
//    
//    UserModel.getUsername();
//    UserModel.getPassword();
    
    UserDaoPostgres user = new UserDaoPostgres();
    UserModel dataFromDB = user.get(tempname, temppswd);
    String usernameFromDB = dataFromDB.getUsername();
    String passwordFromDB = dataFromDB.getPassword();
    //**Zombie Code**
//    System.out.println(dataFromDB.getUsername());
//    System.out.println(dataFromDB.getPassword());
//    System.out.println("After grabbing from database");
    //**Zombie Code**
    if(usernameFromDB.contentEquals(tempname) & passwordFromDB.contentEquals(temppswd)) {
      System.out.println("It passed");
      Controller.ServiceRoutes();
    }else {
      System.out.println("That user doesn't exist.");
    }
    
   //starts controller
//    Controller.ServiceRoutes();
  }
}
