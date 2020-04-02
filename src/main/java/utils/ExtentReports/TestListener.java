package utils.ExtentReports;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.service.ExtentTestManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

import static utils.ExtentReports.ReportHelper.configureReport;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        BaseTest.setExtentTest(ExtentTestManager.createMethod(result));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTestManager.getTest(result).pass("Passou gurizadaaa!!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTestManager.getTest(result).fail("Deu ruimmm cambadaaa... \n" + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTestManager.getTest(result).skip("Pulouuu.. deu alguma zica...");
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
