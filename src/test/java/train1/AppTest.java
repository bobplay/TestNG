package train1;

import java.util.Random;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
@Test
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

	@Test(invocationCount=5,skipFailedInvocations=true)
	public void test1(){
		int r = new Random().nextInt(3);
		System.out.println("this is 11--"+r);
		AssertJUnit.assertFalse(r<2);
	}	

	private void test2(){
		System.out.println("time out");
		String str="";
		for(int i=0;i<100000;i++){
			str += String.valueOf(i);
		}
		
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