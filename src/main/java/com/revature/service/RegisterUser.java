package com.revature.service;

import com.revature.controller.Controller;
import com.revature.controller.MainUserInterface;
import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;

public class RegisterUser {
  
  public static void registerUser() {
    String usrnm = CreateUserName.usernameCredentials(); //Saves to 'usrnm' what the user wants to make a username
    String pswrd = CreatePassword.passwordCredentials(); //Saves to 'pswrd' what the user wants to make a password
    System.out.println("To start your account you need to deposit money.");//Initialize balance
    
    Services.depositMoneyOnRegister();
    Double blnce = UserModel.getBalance();
    UserModel usr = new UserModel(usrnm, pswrd, blnce);
    usrnm = usr.getUsername();
    pswrd = usr.getPassword();
    blnce = usr.getBalance();
//    CheckIfUserExists.checkIfUserExists();
    
    

    
    UserDaoPostgres newUser = new UserDaoPostgres();
    newUser.save(usr);
    System.out.println("User with username " + usrnm + " has been registered.");
    
    MainUserInterface maininterface = new MainUserInterface();
    maininterface.promptUser();
    
  }

}
