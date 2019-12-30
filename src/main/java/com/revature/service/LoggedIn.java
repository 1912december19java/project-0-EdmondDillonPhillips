package com.revature.service;

import com.revature.model.UserModel;

public class LoggedIn {
public static void login() {
  UserModel.setLoggedin(true);
}
}
