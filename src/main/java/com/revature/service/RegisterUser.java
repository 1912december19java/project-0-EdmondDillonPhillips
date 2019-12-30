package com.revature.service;

import com.revature.controller.Controller;
import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;

public class RegisterUser {
  
  public static void registerUser() {
    String usrnm = CreateUserName.userNameLogin(); //stores local username
    String pswrd = CreatePassword.userPasswordLogin(); //stores local password
    System.out.println("To start your account you need to deposit money.");//Initialize balance
    
    Services.depositMoney();
    Double blnce = UserModel.getBalance();
    UserModel usr = new UserModel(usrnm, pswrd, blnce);
    usrnm = usr.getUsername();
    pswrd = usr.getPassword();
    blnce = usr.getBalance();
//    CheckIfUserExists.checkIfUserExists();
    
    

    
    UserDaoPostgres newUser = new UserDaoPostgres();
    newUser.save(usr);
    
    Controller.ServiceRoutes();
    
  }

}
