package utils;

import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.*;
import static utils.RouteConstants.URL;

public class BaseTest {

    @BeforeClass(alwaysRun = true)
    // Pre-condicao
    public static void preCondicao() {
        baseURI = URL;
        enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
