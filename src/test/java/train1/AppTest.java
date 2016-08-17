package train1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest{
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("BeforeSuite_______-");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest(){
		System.out.println("BeforeTest-");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass(){
		System.out.println("BeforeClass++++"); 
	}	
	@AfterClass
	public void afterClass(){
		System.out.println("AfterClass++++"); 
	}	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("BeforeMethod++++"); 
	}	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("AfterMethod____________");
	}	
	@Test(dependsOnMethods="test1")
	public void test(){
		System.out.println("++++"); 
	}	
	@Test
	public void test1(){
		System.out.println("---------------this is test1");
	}	
	@org.testng.annotations.AfterTest
	public void AfterTest(){
		System.out.println("afterTest_______-");
	}	
	@AfterSuite
	public void AfterSuite(){
		System.out.println("afterSuite_______-");
	}	
}