package com.revature;

import com.revature.controller.MainUserInterface;
import com.revature.repository.UserDaoPostgres;
import org.apache.log4j.Logger;



/** 
 * Create an instance of your controller and launch your application.
 * 
 * Try not to have any logic at all on this class.
 */
public class Main {
  
  private static Logger log = Logger.getLogger(UserDaoPostgres.class);

	public static void main(String[] args) {
	        log.info("Program Started");
	        MainUserInterface userinterface = new MainUserInterface();
	        userinterface.promptUser();

	}
}
