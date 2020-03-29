package posts;

import constructors.ContribuidorConstructor;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.Random;

import static io.restassured.RestAssured.given;
import static utils.RoutesConstants.POST_CONTRIBUIDOR;

public class ContribuidorPostTest extends BaseTest {

    @Test(groups = {"funcional"})
    public static void cadastrarContribuidorOK() {
        Random r = new Random();
        int x = r.nextInt();

        ContribuidorConstructor contribuidor = ContribuidorConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type("CONTRIBUTOR").
                first_name("Arthur").
                last_name("Boeck").
                build();

        given().
                contentType(ContentType.JSON).
                body(contribuidor).
                when().
                post(POST_CONTRIBUIDOR).
                then().
                statusCode(200);
    }

}
