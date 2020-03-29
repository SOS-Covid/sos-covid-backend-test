package posts;

import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertTrue;
import static utils.RouteConstants.GET_GENERICO;
import static utils.UtilConstants.CONTRIBUIDOR;
import static utils.UtilConstants.ENTIDADE;

public class FindGetTest extends BaseTest {

//    @Test(groups = {"funcional"})
    public static void obterTodosRegistros() {
        when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200);
    }

//    @Test(groups = {"funcional"})
    public static void ValidarListagemInativos() {
        List<Boolean> values = given().
                queryParam("status", Boolean.FALSE).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().jsonPath().
                getList("status");

        assertTrue(values.contains(Boolean.FALSE));
    }

//    @Test(groups = {"funcional"})
    public static void ValidarListagemAtivos() {
        List<Boolean> values = given().
                queryParam("status", Boolean.TRUE).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().jsonPath().
                getList("status");

        assertTrue(values.contains(Boolean.TRUE));
    }

//    @Test(groups = {"funcional"})
    public static void ValidarListagemContribuidores() {
        List<String> values = given().
                queryParam("type", CONTRIBUIDOR).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().jsonPath().
                getList("type");

        assertTrue(values.contains(CONTRIBUIDOR));
    }

//    @Test(groups = {"funcional"})
    public static void ValidarListagemEntidades() {
        List<String> values = given().
                queryParam("type", ENTIDADE).
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(200).
                extract().jsonPath().
                getList("type");

        assertTrue(values.contains(ENTIDADE));
    }

//    @Test(groups = {"funcional"})
    public static void ConsultaSemRetorno() {
        given().
                queryParam("type", "").
                when().
                get(GET_GENERICO).
                then().log().all().
                statusCode(404);
    }
}
