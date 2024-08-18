package coverFoxUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import coverFoxBase.Base;

public class Listener extends Base implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

	Reporter.log("TC " +result.getName()+" execution started", true);
	}
	@Override

	public void onTestSuccess(ITestResult result) {
	Reporter.log("TC " +result.getName()+" completed successfully", true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
	Reporter.log("TC "+result.getName()+" failed", true);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
	Reporter.log("TC " +result.getName()+" is skipped", true);
	}
}
