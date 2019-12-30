package com.revature.service;

import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;

public class AddUserToDatabase {

  public static void addUserToDatabase() {
    String username = UserModel.getUsername();
    String pswd = UserModel.getPassword();
    double blnce = UserModel.getBalance();
    boolean logedin = UserModel.isLoggedin();
    
    UserDaoPostgres saveUser = new UserDaoPostgres();
    UserModel user = new UserModel(username, pswd, blnce);
    
    

    saveUser.save(username, pswd, blnce);
  }
}
