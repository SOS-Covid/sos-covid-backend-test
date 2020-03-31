package posts;

import constructors.ContribuidorConstructor;
import dataproviders.ContribuidorDataProvider;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static utils.RouteConstants.DELETE_USER;
import static utils.RouteConstants.REGISTER_USER;

public class ContribuidorPostTest extends BaseTest {

    @Test(dataProvider = "OptionalFields", dataProviderClass = ContribuidorDataProvider.class,
            groups = {"funcional"})
    public static void cadastrarContribuidorOK(ContribuidorConstructor contribuidor) {

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(200);

        when().
                delete(DELETE_USER + contribuidor.getEmail()).
                then().log().all().
                statusCode(204);
    }

    @Test(dataProvider = "Required-BlankFields", dataProviderClass = ContribuidorDataProvider.class,
            groups = {"funcional"})
    public static void validarCamposObrigatoriosVazio(ContribuidorConstructor contribuidor) {

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(400);
    }
}
