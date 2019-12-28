package com.revature.model;

public class UserModel {
  
  
  private static String username;
  private static String password;
  private static double balance;

  
//Constructor for User Model
  public UserModel(String usrnm, String pswd, double blnce) {
    super();
    username = usrnm;
    password = pswd;
    balance = blnce;
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


  public void setBalance(double balance) {
    this.balance = balance;
  }
  public static void printEqualsLine() {
    // TODO Auto-generated method stub
    System.out.println("=======================================================================================================");
    
  }


}
