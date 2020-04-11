package dataproviders;

import constructors.UserConstructor;
import factories.UserFactory;
import org.testng.annotations.DataProvider;

public class UserDataProvider {

    @DataProvider(name = "Required-BlankFields")
    public static Object[][] dataProviderRequiredBlankFields() {
        UserConstructor semParamEmail = UserFactory.userSemParamEmail();
        UserConstructor semParamPassword = UserFactory.userSemParamPassword();
        UserConstructor semParamType = UserFactory.userSemParamType();
        UserConstructor semParamCpfCnpj = UserFactory.userSemParamCpfCnpj();
        UserConstructor semParamPhone1 = UserFactory.userSemParamPhone1();
        UserConstructor semEmail = UserFactory.userOK();
        UserConstructor emailInvalido = UserFactory.userOK();
        UserConstructor semPassword = UserFactory.userOK();
        UserConstructor passwordInvalido = UserFactory.userOK();
        UserConstructor semType = UserFactory.userOK();
        UserConstructor typeInvalido = UserFactory.userOK();
        UserConstructor semCpf = UserFactory.userOK();
        UserConstructor cpfInvalido = UserFactory.userOK();
        UserConstructor semTelefone = UserFactory.userOK();
        UserConstructor firstNameInvalido = UserFactory.userOK();
        UserConstructor lastNameInvalido = UserFactory.userOK();
        semEmail.setEmail("");
        emailInvalido.setEmail("teste");
        semPassword.setPassword("");
        passwordInvalido.setPassword("1234567890");
        semType.setType("");
        typeInvalido.setType("teste");
        semCpf.setCpf_cnpj("");
        cpfInvalido.setCpf_cnpj("12345678901234567890");
        semTelefone.setPhone1("");
        firstNameInvalido.setFirst_name("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce purus quam, rhoncus in efficitur eget, commodo quis justo. Aenean quis porta nisl. Proin posuere scelerisque justo, non rhoncus orci sed.");
        lastNameInvalido.setFirst_name("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce purus quam, rhoncus in efficitur eget, commodo quis justo. Aenean quis porta nisl. Proin posuere scelerisque justo, non rhoncus orci sed.");

        return new Object[][]{{semEmail}, {emailInvalido}, {semPassword}, {passwordInvalido}, {semType},
                {typeInvalido}, {semCpf}, {cpfInvalido}, {semTelefone}, {firstNameInvalido}, {lastNameInvalido},
                {semParamEmail}, {semParamPassword}, {semParamType}, {semParamCpfCnpj}, {semParamPhone1}};
    }

    @DataProvider(name = "OptionalFields")
    public static Object[][] dataProviderOptionalFields() {
        UserConstructor SemParamFirstName = UserFactory.userSemParamFirstName();
        UserConstructor SemParamLastName = UserFactory.userSemParamLastName();

        return new Object[][]{{SemParamFirstName}, {SemParamLastName}};
    }

    @DataProvider(name = "Complete")
    public static Object[][] dataProviderComplete() {
        UserConstructor userOK = UserFactory.userOK();

        return new Object[][]{{userOK}};
    }
}
