package posts;

import io.restassured.http.ContentType;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static utils.RouteConstants.GET_GENERICO;
import static utils.RouteConstants.POST_SESSION;
import static utils.UtilConstants.CONTRIBUIDOR;
import static utils.UtilConstants.ENTIDADE;
import static utils.UtilsTest.generateValidEmail;

public class SessionPostTest extends BaseTest {

    private static String rightPassword = "teste123";
    private static String wrongPassword = "xxxxxxx";

    //    @Test(groups = {"funcional"})
    public static void SessionContribuidorOK() {
        String mail = given().
                queryParam("status", Boolean.TRUE).
                queryParam("type", CONTRIBUIDOR).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].email");

        given().
                contentType(ContentType.JSON).
                param("email", mail).
                param("password", rightPassword).
                when().
                post(POST_SESSION).
                then().log().all().
                statusCode(200);
    }

    //    @Test(groups = {"funcional"})
    public static void SessionContribuidorSenhaNOK() {
        String mail = given().
                queryParam("status", Boolean.TRUE).
                queryParam("type", CONTRIBUIDOR).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].email");

        given().
                contentType(ContentType.JSON).
                param("email", mail).
                param("password", wrongPassword).
                when().
                post(POST_SESSION).
                then().log().all().
                statusCode(404);
    }

    //    @Test(groups = {"funcional"})
    public static void SessionEntidadeOK() {
        String mail = given().
                queryParam("status", Boolean.TRUE).
                queryParam("type", ENTIDADE).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].email");

        given().
                contentType(ContentType.JSON).
                param("email", mail).
                param("password", rightPassword).
                when().
                post(POST_SESSION).
                then().log().all().
                statusCode(200);
    }

    //    @Test(groups = {"funcional"})
    public static void SessionEntidadeSenhaNOK() {
        String mail = given().
                queryParam("status", Boolean.TRUE).
                queryParam("type", ENTIDADE).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].email");

        given().
                contentType(ContentType.JSON).
                param("email", mail).
                param("password", wrongPassword).
                when().
                post(POST_SESSION).
                then().log().all().
                statusCode(404);
    }

    //    @Test(groups = {"funcional"})
    public static void SessionEmailNOK() {
        String mail = generateValidEmail();

        given().
                contentType(ContentType.JSON).
                param("email", mail).
                param("password", rightPassword).
                when().
                post(POST_SESSION).
                then().log().all().
                statusCode(404);
    }
}
