package dataproviders;

import constructors.ContribuidorConstructor;
import factories.ContribuidorFactory;
import org.testng.annotations.DataProvider;

public class ContribuidorDataProvider {

    @DataProvider(name = "Required-BlankFields")
    public static Object[][] dataProviderRequiredBlankFields() {
        ContribuidorConstructor semParamEmail = ContribuidorFactory.ContribuidorSemParamEmail();
        ContribuidorConstructor semParamPassword = ContribuidorFactory.ContribuidorSemParamPassword();
        ContribuidorConstructor semParamType = ContribuidorFactory.ContribuidorSemParamType();
        ContribuidorConstructor semParamCpfCnpj = ContribuidorFactory.ContribuidorSemParamCpfCnpj();
        ContribuidorConstructor semParamPhone1 = ContribuidorFactory.ContribuidorSemParamPhone1();
        ContribuidorConstructor statusAtivo = ContribuidorFactory.ContribuidorStatusAtivo();
        ContribuidorConstructor semEmail = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor emailInvalido = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor semPassword = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor passwordInvalido = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor semType = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor typeInvalido = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor semCpf = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor cpfInvalido = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor semTelefone = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor firstNameInvalido = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor lastNameInvalido = ContribuidorFactory.ContribuidorOK();
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
                {semParamEmail}, {semParamPassword}, {semParamType}, {semParamCpfCnpj}, {semParamPhone1}, {statusAtivo}};
    }

    @DataProvider(name = "OptionalFields")
    public static Object[][] dataProviderOptionalFields() {
        ContribuidorConstructor SemParamFirstName = ContribuidorFactory.ContribuidorSemParamFirstName();
        ContribuidorConstructor SemParamLastName = ContribuidorFactory.ContribuidorSemParamLastName();
        ContribuidorConstructor enderecoInvalido = ContribuidorFactory.ContribuidorEnderecoInvalido();

        return new Object[][]{{SemParamFirstName},
                {SemParamLastName}, {enderecoInvalido}};
    }

    @DataProvider(name = "Complete")
    public static Object[][] dataProviderComplete() {
        ContribuidorConstructor contribuidorOK = ContribuidorFactory.ContribuidorOK();
        ContribuidorConstructor contribuidorMultiEnderecoOK = ContribuidorFactory.ContribuidorMultiEnderecosOK();

        return new Object[][]{{contribuidorOK}, {contribuidorMultiEnderecoOK}};
    }
}
