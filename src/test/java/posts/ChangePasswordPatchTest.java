package posts;

import io.restassured.http.ContentType;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static utils.RouteConstants.*;
import static utils.UtilConstants.CONTRIBUIDOR;
import static utils.UtilConstants.ENTIDADE;

public class ChangePasswordPatchTest extends BaseTest {

    private static String password = "teste123";
    private static String newPassword = "teste1234";

    //    @Test(groups = {"funcional"})
    public static void AlterarSenhaContribuidor() {
        String mail = given().
                queryParam("status", Boolean.TRUE).
                queryParam("type", CONTRIBUIDOR).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].email");

        String token = given().
                contentType(ContentType.JSON).
                param("email", mail).
                param("password", password).
                when().
                post(POST_SESSION).
                then().log().all().
                statusCode(200).
                extract().
                path("token");

        given().auth().
                oauth2(token).
                param("email", mail).
                param("newPassword", newPassword).
                when().
                patch(PATCH_NEW_PASSWORD).
                then().log().all().
                statusCode(204);
    }

    //    @Test(groups = {"funcional"})
    public static void AlterarSenhaEntidade() {
        String mail = given().
                queryParam("status", Boolean.TRUE).
                queryParam("type", ENTIDADE).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().
                path("[0].email");

        String token = given().
                contentType(ContentType.JSON).
                param("email", mail).
                param("password", password).
                when().
                post(POST_SESSION).
                then().log().all().
                statusCode(200).
                extract().
                path("token");

        given().auth().
                oauth2(token).
                param("email", mail).
                param("newPassword", newPassword).
                when().
                patch(PATCH_NEW_PASSWORD).
                then().log().all().
                statusCode(204);
    }

    //    @Test(groups = {"funcional"})
    public static void AlterarSenhaTokenInvalido() {
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
                param("email", mail).
                param("newPassword", newPassword).
                when().
                patch(PATCH_NEW_PASSWORD).
                then().log().all().
                statusCode(403);
    }

}
