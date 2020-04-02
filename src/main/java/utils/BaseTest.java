package utils;

import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import utils.ExtentReports.MyTestListener;
import utils.ExtentReports.ReportHelper;

import java.io.IOException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;
import static utils.ExtentReports.ReportHelper.configureReport;
import static utils.RouteConstants.URL;

@Listeners(MyTestListener.class)
public class BaseTest {

    private static ExtentTest extentTest;

    @BeforeSuite(alwaysRun = true)
    public static void preCondicao() {
        configureReport();
        baseURI = URL;
        enableLoggingOfRequestAndResponseIfValidationFails();
    }



    @AfterSuite
    public void updateReport() throws IOException {
        ReportHelper.updateReport();
    }

    public static void setExtentTest(ExtentTest test) {
        extentTest = test;
    }
}
