package posts;

import constructors.CampanhaConstructor;
import dataproviders.CampanhaDataProvider;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static utils.RouteConstants.DELETE_CAMPANHA;
import static utils.RouteConstants.REGISTER_CAMPANHA;

public class CampanhaPostTest extends BaseTest {

    @Test(dataProvider = "OptionalFields", dataProviderClass = CampanhaDataProvider.class,
            groups = {"funcional"})
    public static void cadastrarCampanhaOK(CampanhaConstructor campanha) {

        given().
                contentType(ContentType.JSON).
                body(campanha).
                when().
                post(REGISTER_CAMPANHA).
                then().log().all().
                statusCode(200);

        when().
                delete(DELETE_CAMPANHA + campanha.getReference_user()).
                then().log().all().
                statusCode(204);
    }

    @Test(dataProvider = "Required-BlankFields", dataProviderClass = CampanhaDataProvider.class,
            groups = {"funcional"})
    public static void validarCamposObrigatoriosVazio(CampanhaConstructor campanha) {

        given().
                contentType(ContentType.JSON).
                body(campanha).
                when().
                post(REGISTER_CAMPANHA).
                then().log().all().
                statusCode(400);
    }
}
