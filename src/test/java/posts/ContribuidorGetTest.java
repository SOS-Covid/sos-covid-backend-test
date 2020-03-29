package posts;

import constructors.ContribuidorConstructor;
import dataproviders.ContribuidorDataProvider;
import factories.ContribuidorFactory;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static utils.RouteConstants.GET_CONTRIBUIDOR;
import static utils.RouteConstants.REGISTER_USER;

public class ContribuidorGetTest extends BaseTest {

    @Test(groups = {"funcional"})
    public static void obterContribuidoresFullList() {
        when().
                get(GET_CONTRIBUIDOR).
                then().log().all().
                statusCode(200);
    }
    
}
