package com.revature.service;

import org.apache.log4j.Logger;
import com.revature.controller.Controller;
import com.revature.controller.MainUserInterface;
import com.revature.controller.ReadInput;
import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;

public class UserLogin {
  
  private static Logger log = Logger.getLogger(UserLogin.class);

  
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
    
//    System.out.println(usernameFromDB);
//    System.out.println(tempname);
    
    //I need to query all of the users on the database to see if a user already exists.
    
    if(usernameFromDB.contentEquals(tempname) && passwordFromDB.contentEquals(temppswd)) {

      Controller.ServiceRoutes();
    }else {
      log.error("User tried to log in with username: " + tempname + " and was unsuccessful.");
      System.out.println("Incorrect username or password");
      MainUserInterface maininterface = new MainUserInterface();
      maininterface.promptUser();
    }
    
   //starts controller
//    Controller.ServiceRoutes();
  }
}
