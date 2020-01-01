package com.revature.repository;

import java.util.List;

import com.revature.model.UserModel;

public interface UserDao {
  
  //gets a user by username
  UserModel get(String username, String password);
  
//  //gets all users
//  List<UserModel> getAll();
  
  //Update existing user. Works by username.
  void update();
  
//Save new user.
  void save(UserModel user);



}
