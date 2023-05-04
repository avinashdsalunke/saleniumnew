package Rsources;

import java.util.ArrayList;
import java.util.HashMap;

public class constant { 
	 public static String username = "ramesh";
	  public static String password = "";
	  public static String loginexpectedMessage = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	  public static String Firstname = "ramesh";
	  public static String lastname = "123";
	  public static String path = "F:\\data chale.xlsx";
	  public static String coluser = "5";
	  public static String colpass = "6";
	  public static String sheet = "0";
	  public static String datasheet = "Data should be invalid";

	/*  public ArrayList<ArrayList<String>> userpass() {
	    ArrayList<String> name1 = new ArrayList<String>(); // here name1 is only declared under userpass().no connection
	                              // between them.
	    ArrayList<String> pass = new ArrayList<String>();
	    
	    name1.add("vinay");
	    name1.add("virat");
	    name1.add("sairat");
	    name1.add("balma");
	    name1.add("sajninakhrewali");

	    pass.add("vinay@123");
	    pass.add("virat@123");
	    pass.add("sairat@123");
	    pass.add("balma@420");
	    pass.add("sajninakhrewali@123");

	    ArrayList<ArrayList<String>> userpass = new ArrayList<ArrayList<String>>(); // name1 and pass got connected with
	                                          // this object
	    userpass.add(name1);
	    userpass.add(pass);
	    return userpass;
	  }*/

	  public constant(ArrayList<String> name1,ArrayList<String> pass) {
	      
	    name1.add("vinay");
	    name1.add("virat");
	    name1.add("sairat");
	    name1.add("balma");
	    name1.add("sajninakhrewali");

	    pass.add("vinay@123");
	    pass.add("virat@123");
	    pass.add("sairat@123");
	    pass.add("balma@420");
	    pass.add("sajninakhrewali@123");
	    
	   }

	  }