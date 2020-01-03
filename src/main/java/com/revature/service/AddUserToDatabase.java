package com.revature.service;

import com.revature.exception.UserAlreadyExistsException;
import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;
import org.apache.log4j.Logger;

public class AddUserToDatabase {
  
  private static Logger log = Logger.getLogger(AddUserToDatabase.class);

  public static void addUserToDatabase() throws UserAlreadyExistsException {
    String username = UserModel.getUsername();
    String pswd = UserModel.getPassword();
    double blnce = UserModel.getBalance();
//    boolean logedin = UserModel.isLoggedin();
    
    UserDaoPostgres saveUser = new UserDaoPostgres();
    UserModel user = new UserModel(username, pswd, blnce);
    
    String dbUser = user.getUsername();
    
    if(username.contentEquals(dbUser)) {
      log.error("User already exists");
      throw new UserAlreadyExistsException();
    }else {
      saveUser.save(user);
//    username, pswd, blnce
    }


  }
}
