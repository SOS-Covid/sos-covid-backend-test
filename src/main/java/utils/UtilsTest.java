package utils;

import java.util.Random;

import static io.restassured.RestAssured.when;
import static utils.RouteConstants.GET_ORGANIZACAO;
import static utils.RouteConstants.GET_ORGANIZACAO_ALL;

public class UtilsTest {

    public static String generateValidEmail() {
        Random r = new Random();
        int x = r.nextInt();

        return "teste" + Integer.toString(x) + "@teste.com";
    }

    public static String getOrganizationEmail() {
        return when().
                get(GET_ORGANIZACAO_ALL).
                then().log().all().
                statusCode(200).
                extract().
                path("data[0].email");
    }
}
