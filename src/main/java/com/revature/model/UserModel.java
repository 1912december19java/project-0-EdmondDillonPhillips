package com.revature.model;

public class UserModel {
  
  private static String username;
  private static String password;
  private static double balance;
  private static boolean loggedin;

  private static double amountAdded;
  private static double amountWithdrawn;

  //Constructor for User Model
  public UserModel(String usrnm, String pswd, double blnce) {
    super();
    this.username = usrnm;
    this.password = pswd;
    this.balance = blnce;
  }



  public static double getAmountWithdrawn() {
    return amountWithdrawn;
  }


  public static void setAmountWithdrawn(double amountWithdrawn) {
    UserModel.amountWithdrawn = amountWithdrawn;
  }



  
  
public UserModel() {
    // TODO Auto-generated constructor stub
  }


public static double getAmountAdded() {
    return amountAdded;
  }


  public static void setAmountAdded(double amountAdded) {
    UserModel.amountAdded = amountAdded;
  }


  //Getter/Setter for username
  public static String getUsername() {
//    System.out.println(username);
    return username;
  }
  public static void setUsername(String user) {
    username = user;
  }

//Getter/Setter for password
  public static String getPassword() {
//    System.out.println(password);
    return password;
  }
  public static void setPassword(String temp) {
    password = temp;
  }

//Getter/Setter for balance
  public static double getBalance() {
    return balance;
  }
  public static void setBalance() {
    balance -= amountWithdrawn;
  }
  
  public static void setInitialBalance() {
    balance = 0;
  }
  
  //Getter/Setter for updatedBalance
  public static double getDepositBalance() {
    return balance;
  }
  public static void setDepositBalance() {
    balance += amountAdded;
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
    System.out.println("=======================================================");
    
  }


}
