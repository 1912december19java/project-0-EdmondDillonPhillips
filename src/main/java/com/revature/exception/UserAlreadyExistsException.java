package com.revature.exception;

import java.sql.SQLException;
import org.apache.log4j.Logger;
import com.revature.repository.UserDaoPostgres;

public class UserAlreadyExistsException extends Exception {
  
  private static Logger log = Logger.getLogger(UserAlreadyExistsException.class);

  public static void userAlreadyExistsException( UserAlreadyExistsException e) {
    log.error("The user has already been added to the database", e);
  }
}
