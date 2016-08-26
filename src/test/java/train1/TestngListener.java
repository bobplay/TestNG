package train1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hamcrest.generator.qdox.tools.QDoxTester.Reporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty7.util.log.Log;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.apache.commons.*;

import com.sun.jna.platform.FileUtils;
//用户1.IResultListener2测试结果监听，2.IConfigurationListener2配置监听3.ITestListener测试用例结果监听
public class TestngListener extends TestListenerAdapter{
	//当用例失败，跳过
	//测试结果监听，配置方法监听 I
	public void onTestFailure(ITestResult tr){
		super.onTestFailure(tr);
		System.out.println("failed");
		super.onTestFailure(tr);
		org.testng.Reporter.log(tr.getName() + " Failure");	
		takeScreenShot(tr);
	}
	private void takeScreenShot(ITestResult tr) {
	}
	
		
}

