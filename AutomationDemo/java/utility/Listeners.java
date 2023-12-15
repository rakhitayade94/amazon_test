
package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestStarts(ITestResult result) {
		System.out.println("Test Start"+ result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failure"+ result.getName());
		try {
			ScreenShot.sShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped"+result.getName());
	}
}

