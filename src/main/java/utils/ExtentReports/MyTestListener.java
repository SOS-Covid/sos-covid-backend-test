package utils.ExtentReports;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.service.ExtentTestManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

import static utils.ExtentReports.ReportHelper.configureReport;

public class MyTestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        BaseTest.setExtentTest(ExtentTestManager.createMethod(result));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTestManager.getTest(result).pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTestManager.getTest(result).fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTestManager.getTest(result).skip("Test Skiped");
    }

    @Override
    public void onStart(ITestContext context) {
        configureReport();
        ExtentService.getInstance().setAnalysisStrategy(AnalysisStrategy.CLASS);
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentService.getInstance().flush();
    }


}
