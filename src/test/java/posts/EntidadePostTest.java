package posts;

import constructors.ContribuidorConstructor;
import constructors.EntidadeConstructor;
import factories.ContribuidorFactory;
import factories.EnderecoFactory;
import factories.EntidadeFactory;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static utils.RouteConstants.REGISTER_USER;

public class EntidadePostTest extends BaseTest {

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeOK() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeOK();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(200);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeCpfCnpjVazio() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeCpfCnpjVazio();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeEmailVazio() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeEmailVazio();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamEmail() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamEmail();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeMaskEmailInvalida() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeMaskEmailInvalida();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamPassword() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamPassword();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadePasswordVazio() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadePasswordVazio();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamType() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamType();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeTypeVazio() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeTypeVazio();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeTypeInvalido() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeTypeInvalido();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamFistName() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamFirstName();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamLastName() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamLastName();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamNameOrganization() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamNameOrganization();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamCpfCnpj() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamCpfCnpj();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeCpfCnpjInvalidSize() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeCpfCnpjInvalidSize();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamPhone1() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamPhone1();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamSite() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamSite();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamInstagram() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamInstagram();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamFacebook() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamFacebook();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamGroupFinality() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamGroupFinality();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }

    @Test(groups = {"funcional"})
    public static void cadastrarEntidadeSemParamAcceptDone() {

        EntidadeConstructor entidade = EntidadeFactory.EntidadeSemParamAcceptDonate();

        given().
                contentType(ContentType.JSON).
                body(entidade).
                when().
                post(REGISTER_USER).
                then().
                statusCode(500);
    }
}
