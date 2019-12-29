package com.revature.model;

public class UserModel {
  
  private static String username;
  private static String password;
  private static double balance;
  private static boolean loggedin;

  
//Constructor for User Model
  public UserModel(String usrnm, String pswd, double blnce, boolean login) {
    super();
    username = usrnm;
    password = pswd;
    balance = blnce;
    loggedin = login;
  }
  
  
//Getter/Setter for username
  public static String getUsername() {
    return username;
  }
  public static void setUsername(String user) {
    username = user;
  }

//Getter/Setter for password
  public static String getPassword() {
    return password;
  }
  public static void setPassword(String temp) {
    password = temp;
  }

//Getter/Setter for balance
  public static double getBalance() {
    return balance;
  }
  public static void setBalance(double blnce) {
    balance = blnce;
  }
  
  //Getter/setter for logged in
  public static boolean isLoggedin() {
    return loggedin;
  }
  public static void setLoggedin(boolean loggedin) {
    UserModel.loggedin = loggedin;
  }
  
  public static void printEqualsLine() {
    // TODO Auto-generated method stub
    System.out.println("=======================================================================================================");
    
  }


}
