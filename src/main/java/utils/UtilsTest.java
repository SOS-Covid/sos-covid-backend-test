package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.Random;

import static io.restassured.RestAssured.when;
import static utils.RouteConstants.GET_ORGANIZACAO;

public class UtilsTest {

    public static String generateValidEmail() {
        Random r = new Random();
        int x = r.nextInt();

        return "teste" + Integer.toString(x) + "@teste.com";
    }

    public static String getOrganizationEmail() {
        return when().
                get(GET_ORGANIZACAO).
                then().log().all().
                statusCode(200).
                extract().
                path("data[0].email");
    }

}
