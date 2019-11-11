package day7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(priority=1,groups= {"sanity"})
public class TestingClass1 {
  public void testcase1() {
	  System.out.println("Executing test case 1..");
  }
  public void testcase6() {
	  System.out.println("Executing test case 6..");
  }
  public void testcase3() {
	  System.out.println("Executing test case 3..");
  }
  public void testcase7() {
	  System.out.println("Executing test case 7..");
  }
  //it will not run
  public void testcase2() {
	  System.out.println("Executing test case 2..");
  }
  @BeforeMethod(alwaysRun=true)
  public void beforeAMethod()
  {
	  System.out.println("Before a testcase");
	  
  }
  @AfterMethod(alwaysRun=true)
  public void afterAMethod()
  {
	  System.out.println("After a test case");
  }
  @BeforeClass//invoke browser is example it will excute before other method of class
 public void beforeAclass()
 {
	  System.out.println("First method to exute when a class loads");
 }
  @AfterClass//invoke browser is example it will excute before other method of class
  public void afterAclass()
  {
 	  System.out.println("last method to exute when a class loads");
  }
}
