package train1;

import java.util.Random;

import org.testng.AssertJUnit;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parame {
	@Test(expectedExceptions=NullPointerException.class)
	@Parameters({"browser","version"})
	public void parameTest(@Optional("ie") String browser,@Optional("1.0.0") String version){
		System.out.println(browser+"++++++++"+version);
		throw new NullPointerException();
	}
//	@Test(retryAnalyzer=Retry.class)
//	public void test1(){
//		int r = new Random().nextInt(5);
//		System.out.println("this is 11--"+r);
//		AssertJUnit.assertTrue(r==1);
//	
//	}	
}
