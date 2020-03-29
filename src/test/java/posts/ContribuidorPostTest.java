package posts;

import constructors.ContribuidorConstructor;
import dataproviders.ContribuidorDataProvider;
import factories.ContribuidorFactory;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static utils.RouteConstants.REGISTER_USER;

public class ContribuidorPostTest extends BaseTest {

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorOK() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorOK();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(200);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorMultiEnderecosOK() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorMultiEnderecosOK();
        System.out.println(contribuidor);

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(200);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorStatusAtivo() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorStatusAtivo();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(400);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorSemParamEmail() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorSemParamEmail();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().log().all().
                statusCode(400);
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
