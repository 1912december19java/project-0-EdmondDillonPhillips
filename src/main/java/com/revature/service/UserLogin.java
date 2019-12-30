package com.revature.service;

import com.revature.controller.Controller;
import com.revature.controller.ReadInput;
import com.revature.model.UserModel;
import com.revature.repository.UserDaoPostgres;

public class UserLogin {
  public static void userLogin() {
    String tempname = ReadInput.readInput();
    UserModel.setUsername(tempname);
    String temppswd = ReadInput.readInput();
    UserModel.setPassword(temppswd);

    System.out.println(UserModel.getUsername());
    System.out.println(UserModel.getPassword());
    
    UserDaoPostgres user = new UserDaoPostgres();
    user.get(tempname);
    
    
   //starts controller
    Controller.ServiceRoutes();
  }
}
