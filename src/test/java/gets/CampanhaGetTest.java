package gets;

import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static utils.RouteConstants.*;

public class CampanhaGetTest extends BaseTest {

    @Test(groups = {"funcional"})
    public static void obterCampanhaFullList() {
        when().
                get(GET_CAMPANHA_ALL).
                then().log().all().
                statusCode(200);
    }

    @Test(groups = {"funcional"})
    public static void obterCampanhaPaginadaFullList() {
        when().
                get(GET_CAMPANHA_PAGINADA).
                then().log().all().
                statusCode(200);
    }

    @Test(groups = {"funcional"})
    public static void validarPaginacaoUmaCampanha() {
        given().
                queryParam("skip", "0").
                queryParam("limit", "1").
                when().
                get(GET_CAMPANHA_PAGINADA).
                then().log().all().
                statusCode(200).
                body("data[0]._id", notNullValue()).
                body("data[1]._id", equalTo(null));
    }

    @Test(groups = {"funcional"})
    public static void validarPaginacaoNCampanhas() {
        int n = when().
                get(GET_CAMPANHA_PAGINADA).
                then().log().all().
                statusCode(200).
                extract().
                path("total");

        String x = Integer.toString(n - 2);
        String y = Integer.toString(n - 3);

        given().
                queryParam("skip", "0").
                queryParam("limit", x).
                when().
                get(GET_CAMPANHA_PAGINADA).
                then().log().all().
                statusCode(200).
                body("data[0]._id", notNullValue()).
                body("data[" + y + "]._id", notNullValue()).
                body("data[" + x + "]._id", equalTo(null));
    }

}
