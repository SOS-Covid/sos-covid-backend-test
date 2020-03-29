package posts;

import constructors.EntidadeConstructor;
import dataproviders.EntidadeDataProvider;
import factories.EntidadeFactory;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static utils.RouteConstants.REGISTER_USER;

public class EntidadePostTest extends BaseTest {

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeOK() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeOK();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(200);
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
}
