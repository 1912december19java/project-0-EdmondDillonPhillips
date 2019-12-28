package com.revature.repository;

import java.util.List;
import com.revature.model.UserModel;

public interface UserDao {
  
  //gets a user by username
  UserModel get(String username);
  
  //Update existing user. Works by username.
  void update(UserModel user);

}
