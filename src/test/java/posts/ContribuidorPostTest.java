package posts;

import constructors.ContribuidorConstructor;
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
                then().
                statusCode(200);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorMultiEnderecosOK() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorMultiEnderecosOK();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().
                statusCode(200);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorCpfCnpjVazio() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorCpfCnpjVazio();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorEmailVazio() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorEmailVazio();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorInativo() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorInativo();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorMaskEmailInvalida() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorMaskEmailInvalida();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorPhoneVazio() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorPhoneVazio();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorSemParamEmail() {

        ContribuidorConstructor contribuidor = ContribuidorFactory.ContribuidorSemParamEmail();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }
}
