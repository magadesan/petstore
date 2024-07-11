package utils;

import org.openapitools.client.logs.ExtentManager;
import org.openapitools.client.logs.ExtentTestManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    private String methodName = "";

    @Override
    public void onTestStart(ITestResult iTestResult) {
        String testCase;
        try {
            methodName = iTestResult.getTestClass().getName() + "#" + iTestResult.getName() + "</br>" + iTestResult.getMethod().getDataProviderMethod().getName();
            testCase = methodName + ": " + iTestResult.getParameters()[0].toString();
        } catch (Exception exp) {
            methodName = iTestResult.getTestClass().getName() + "#" + iTestResult.getName() + "</br>";
            testCase = methodName;
        }
        ExtentTestManager.startTest(testCase);
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        ExtentManager.getInstance().flush();
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        ExtentManager.getInstance().flush();
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        ExtentTestManager.extent.removeTest(ExtentTestManager.getTest());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
    }
}
