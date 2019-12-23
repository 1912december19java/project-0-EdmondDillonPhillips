package com.revature;

import com.revature.controller.Controller;



/** 
 * Create an instance of your controller and launch your application.
 * 
 * Try not to have any logic at all on this class.
 */
public class Main {

	public static void main(String[] args) {
		
//			Controller controller = new Controller();
			Controller.userNameLogin();
			Controller.userPasswordLogin();
			Controller.ServiceRoutes();
			//Controller.sampleControllerPrint();
			
//			Repository repository = new Repository();
//			repository.sampleRepositoryPrint();
	}
}
