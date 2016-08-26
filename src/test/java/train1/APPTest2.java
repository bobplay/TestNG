package train1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class APPTest2 {
	@BeforeSuite(enabled=false)
	public void BeforeSuite(){
		System.out.println("BeforeSuite2222222222_______-");
	}
	@org.testng.annotations.BeforeTest(enabled=false)
	public void BeforeTest(){
		System.out.println("BeforeTest2222222222222-");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass(){
		System.out.println("BeforeClass222222222++++"); 
	}	
	@AfterClass
	public void afterClass(){
		System.out.println("AfterClass222222222++++"); 
	}	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("BeforeMethod22222222222++++"); 
	}	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("AfterMethod22222222222____________");
	}	
	@Test
	public void test(){
		System.out.println("++++222222222222"); 
		throw new NullPointerException();
	}	
	@Test
	public void test1(){
		System.out.println("---------------this is test12222222222222");
	}	
	@org.testng.annotations.AfterTest(enabled=false)
	public void AfterTest(){
		System.out.println("afterTest_______-");
	}	
	@AfterSuite(enabled=false)
	public void AfterSuite(){
		System.out.println("afterSuite_______-");
	}	
}
