package gets;

import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static utils.RouteConstants.GET_ORGANIZACAO;

public class EntidadeGetTest extends BaseTest {


    @Test(groups = {"funcional"})
    public static void obterTodasEntidades() {
       when().
               get(GET_ORGANIZACAO).
               then().log().all().
               statusCode(200);
    }

    @Test(groups = {"funcional"})
    public static void validarPaginacaoUmaEntidade() {
        given().
                queryParam("skip", "0").
                queryParam("limit", "1").
                when().
                get(GET_ORGANIZACAO).
                then().log().all().
                statusCode(200).
                body("data[].size()", equalTo(0));
    }
}