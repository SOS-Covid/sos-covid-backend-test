package posts;

import constructors.EntidadeConstructor;
import dataproviders.EntidadeDataProvider;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static utils.RouteConstants.DELETE_USER;
import static utils.RouteConstants.REGISTER_USER;

public class EntidadePostTest extends BaseTest {

    @Test(dataProvider = "OptionalFields", dataProviderClass = EntidadeDataProvider.class,
            groups = {"funcional"})
    public static void cadastrarEntidadeOK(EntidadeConstructor entidade) {

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(200);

        when().
                delete(DELETE_USER + entidade.getEmail()).
                then().log().all().
                statusCode(204);
    }

    @Test(dataProvider = "Required-BlankFields", dataProviderClass = EntidadeDataProvider.class,
            groups = {"funcional"})
    public static void validarCamposObrigatoriosVazio(EntidadeConstructor entidade) {

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(400);
    }

    @Test(dataProvider = "semRequiredFields", dataProviderClass = EntidadeDataProvider.class,
            groups = {"funcional"})
    public static void validarCamposObrigatorios(EntidadeConstructor entidade) {

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(400);
    }
}