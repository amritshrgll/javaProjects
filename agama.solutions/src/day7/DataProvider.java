package day7;

import org.testng.annotations.Test;

public class DataProvider {
	
  @Test
  public void printAguments(String username,String password,int employeeId){
	  System.out.println("username-"+username);
	  System.out.println("password-"+password);
  }
  
  @org.testng.annotations.DataProvider
  
  public Object[][] getData(){
	  String[][] data = new String[4][2];
	  data[0][0] = "Saurabh";
	  data[0][1] ="abc@123";
	  data[0][2]=1232;
	  
	  data[1][0] = "Amrit";
	  data[1]12]="xyz@123";
	  data[1][2]=41234;
	  
	  data[2][0]="prasana";
	  data[2][1]="nxd@123";
	  data[2][2]="ghkuh";
  }
}
