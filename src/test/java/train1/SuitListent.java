package train1;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuitListent implements ISuiteListener{

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("this is suitelistenter start");
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("this is suitelistenter end");
	}

}
