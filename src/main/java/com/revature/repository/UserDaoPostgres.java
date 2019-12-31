package com.revature.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.repository.UserDao;
import org.apache.log4j.Logger;

import com.revature.model.UserModel;;

public class UserDaoPostgres implements UserDao {
  
  private static Logger log = Logger.getLogger(UserDaoPostgres.class);
  
  private static Connection conn;
  

  // This guy will run when the class loads, after static fields are initialized.
  static {
    try {
      conn = DriverManager.getConnection(
          System.getenv("connstring"), System.getenv("username"), System.getenv("password"));
      log.info("Connected to Databse");
    } catch (SQLException e) {
      log.error("Failed to connect to database", e);
    }
    System.out.println("Connected To PostgresSQL Database");
  }
  
  //Returns the object "out which has the information collected from the database"
  @Override
  public UserModel get(String username) {
    log.info("Attempting to get User with username: " + username);
    UserModel out = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      stmt = conn.prepareStatement("SELECT username, pswd, balance FROM Users WHERE Username LIKE ?");
      // 1 is the index of the ?
      stmt.setString(1, username);
      // Now our statement is ready to go. Lets run it.
      if (stmt.execute()) {
        // Now we have some results. Lets get them.
        rs = stmt.getResultSet();
      }
      // This line is typical, but not particularly useful for our 1-line rs
      while (rs.next()) {
        out = new UserModel(rs.getString("username"), rs.getString("pswd"), rs.getDouble("balance"));
      }
    } catch (SQLException e) {
      log.error("Failed to retireve User with ID " + username, e );
    }
    
    System.out.println(out.getBalance());
    
    return out;
  }
  
//  @Override
//  public List<UserModel> getAll() {
//    List<UserModel> allUsers = new ArrayList<UserModel>();
//
//    PreparedStatement stmt = null;
//    ResultSet rs = null;
//
//    try {
//      stmt = conn.prepareStatement("SELECT * FROM comics");
//
//      if (stmt.execute()) {
//        rs = stmt.getResultSet();
//      }
//      while (rs.next()) {
//        allUsers.add(new UserModel(rs.getString("username"), rs.getString("pswd"), rs.getDouble("balance"), true));
//      }
//    } catch (SQLException e) {
//      e.printStackTrace();
//    }
//    return allUsers;
//  }
  
//Changes balance in database
  @Override
  public void update() {
    // TODO Auto-generated method stub
    PreparedStatement stmt = null;
    try {
      stmt = conn.prepareStatement("UPDATE Users SET Balance = ? WHERE Username LIKE ?");
      stmt.setDouble(1, UserModel.getBalance());
      stmt.setString(2, UserModel.getUsername());
      
      stmt.execute();
      
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void save(UserModel user) {
    // TODO Auto-generated method stub
    PreparedStatement stmt = null;
    try {
      stmt = conn.prepareStatement(
          "INSERT INTO Users(Username, Pswd, Balance) VALUES (?,?,?)");
      stmt.setString(1, user.getUsername());
      stmt.setString(2, user.getPassword());
      stmt.setDouble(3, user.getBalance());
 
      
      stmt.execute();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }



}
