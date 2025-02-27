package automationpractice.framework1;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class Listeners implements ITestListener{

@Override
public void onTestFailure(ITestResult result)
{
	System.out.println("test failed");
}
	
@Override
public void onTestSuccess(ITestResult result)
{
	System.out.println("test passed");
}

}
