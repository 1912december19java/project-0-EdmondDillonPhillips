package com.revature.TestCases;


import static org.junit.Assert.assertTrue;
import java.sql.Connection;

import java.sql.SQLException;
import org.apache.log4j.Logger;
import java.sql.DriverManager;
import org.junit.Test; 
import org.junit.After;
import org.junit.Before;

import com.revature.exception.UserAlreadyExistsException;
import com.revature.service.Services;
import com.revature.exception.OverDraftException;


public class TestCases {
  
  private static String username = "Test";
  private static String password = "Test";
  
  private static Logger log = Logger.getLogger(TestCases.class);
  
  private static Connection testConn;
  
  static {
    try {
      testConn = DriverManager.getConnection(System.getenv("connstring"),System.getenv("username"),System.getenv("password"));
    }catch(SQLException e) {
      e.printStackTrace();
    }
  }
  
@Test(expected = OverDraftException.class)
public void overDrawException() throws OverDraftException{
  Services.withdrawAmount();
}
}
