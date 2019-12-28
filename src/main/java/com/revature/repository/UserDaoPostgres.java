package com.revature.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.revature.repository.UserDao;
import com.revature.model.UserModel;;

public class UserDaoPostgres implements UserDao {
  
  private static Connection conn;
  
  //Will run when the class loads, after static fields are initialized.
  static {
    
    try {
      conn = DriverManager.getConnection(
          "jdbc:postgresql://database-2.cjmvqnxsbsoz.us-east-1.rds.amazonaws.com:5432/postgres",
          "postgres",
          "Dillson1");
    }
    catch(SQLException e){
      e.printStackTrace();
    }
      System.out.println("Connected?");
  }
  
  @Override
  public UserModel get(String username) {
    UserModel out = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      stmt = conn.prepareStatement("SELECT * FROM Users WHERE username = ?");
      // 1 is the index of the ?
      stmt.setString(1, username);
      // Now our statement is ready to go. Lets run it.
      if (stmt.execute()) {
        // Now we have some results. Lets get them.
        rs = stmt.getResultSet();
      }
      // This line is typical, but not particularly useful for our 1-line rs
      while (rs.next()) {
        out = new UserModel(rs.getString("username"), rs.getInt("password"), rs.getDouble("balance"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return out;
  }

  @Override
  public void update(UserModel user) {
    // TODO Auto-generated method stub
    PreparedStatement stmt = null;
    try {
      stmt = conn.prepareStatement("UPDATE Users SET balance = ?");
      stmt.setDouble(1, UserModel.setBalance(0));
      
      stmt.execute();
      
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
