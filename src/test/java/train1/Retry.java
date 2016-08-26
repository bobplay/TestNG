package train1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	int count = 5;
	public boolean retry(ITestResult result) {
		
		if(result.isSuccess()){
			return false;
		}
		count--;
		if(count == 0) return false;
		return true;
	}

}
