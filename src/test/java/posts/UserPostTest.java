package posts;

import constructors.UserConstructor;
import dataproviders.UserDataProvider;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static utils.RouteConstants.DELETE_USER;
import static utils.RouteConstants.REGISTER_USER;

public class UserPostTest extends BaseTest {

    @Test(dataProvider = "Complete", dataProviderClass = UserDataProvider.class,
            groups = {"funcional"})
    public static void cadastrarEntidadeOK(UserConstructor user) {

        given().
                contentType(ContentType.JSON).
                body(user).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(200);

        when().
                delete(DELETE_USER + user.getEmail()).
                then().log().all().
                statusCode(204);
    }

    @Test(dataProvider = "OptionalFields", dataProviderClass = UserDataProvider.class,
            groups = {"funcional"})
    public static void cadastrarEntidadeOptionalFields(UserConstructor user) {

        given().
                contentType(ContentType.JSON).
                body(user).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(200);

        when().
                delete(DELETE_USER + user.getEmail()).
                then().log().all().
                statusCode(204);
    }

    @Test(dataProvider = "Required-BlankFields", dataProviderClass = UserDataProvider.class,
            groups = {"funcional"})
    public static void validarCamposObrigatoriosVazio(UserConstructor user) {

        given().
                contentType(ContentType.JSON).
                body(user).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(400);
    }
}