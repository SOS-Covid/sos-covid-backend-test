package gets;

import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertTrue;
import static utils.RouteConstants.GET_GENERICO;
import static utils.RouteConstants.PATCH_NEW_PASSWORD;
import static utils.UtilConstants.CONTRIBUIDOR;
import static utils.UtilConstants.ENTIDADE;

public class ActivateUserGetTest extends BaseTest {

    private static String password = "teste123";
    private static String newPassword = "teste1234";

    //    @Test(groups = {"funcional"})
    public static void AtivarContribuidorInativo() {
        String mail = given().
                queryParam("status", Boolean.FALSE).
                queryParam("type", CONTRIBUIDOR).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].email");

        when().
                patch(PATCH_NEW_PASSWORD + "/" + mail).
                then().log().all().
                statusCode(404);

        Boolean status = given().
                queryParam("email", mail).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].status");

        assertTrue(status);
    }

    //    @Test(groups = {"funcional"})
    public static void AtivarContribuidorAtivo() {
        String mail = given().
                queryParam("status", Boolean.TRUE).
                queryParam("type", CONTRIBUIDOR).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].email");

        when().
                patch(PATCH_NEW_PASSWORD + "/" + mail).
                then().log().all().
                statusCode(404);

        Boolean status = given().
                queryParam("email", mail).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].status");

        assertTrue(status);
    }

    //    @Test(groups = {"funcional"})
    public static void AtivarEntidadeInativo() {
        String mail = given().
                queryParam("status", Boolean.FALSE).
                queryParam("type", ENTIDADE).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].email");

        when().
                patch(PATCH_NEW_PASSWORD + "/" + mail).
                then().log().all().
                statusCode(404);

        Boolean status = given().
                queryParam("email", mail).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].status");

        assertTrue(status);
    }

    //    @Test(groups = {"funcional"})
    public static void AtivarEntidadeAtivo() {
        String mail = given().
                queryParam("status", Boolean.TRUE).
                queryParam("type", ENTIDADE).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].email");

        when().
                patch(PATCH_NEW_PASSWORD + "/" + mail).
                then().log().all().
                statusCode(404);

        Boolean status = given().
                queryParam("email", mail).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].status");

        assertTrue(status);
    }
}
