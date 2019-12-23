package com.revature.repository;

public class Repository {
	
    	private static String username;
    	private static String password;

	    public static String getUser() {
	        return username;
	    };
	    public static void setUser(String user) {
	        username = user;
	    };
	    
	    public static String getPassword() {
	        return password;
	    };
	    public static void setPassword(String pwd) {
	        password = pwd;
	    };
	    
	    //Formating
	    
	    public static void printEqualsLine() {
	    	System.out.println("|=====================================================================================|");
	    }



}
