package dataproviders;

import constructors.EntidadeConstructor;
import factories.EntidadeFactory;
import org.testng.annotations.DataProvider;

public class EntidadeDataProvider {

    @DataProvider(name = "Required-BlankFields")
    public static Object[][] dataProviderRequiredBlankFields()
    {
        EntidadeConstructor semEmail = EntidadeFactory.EntidadeOK();
        EntidadeConstructor emailInvalido = EntidadeFactory.EntidadeOK();
        EntidadeConstructor semPassword = EntidadeFactory.EntidadeOK();
        EntidadeConstructor passwordInvalido = EntidadeFactory.EntidadeOK();
        EntidadeConstructor semType = EntidadeFactory.EntidadeOK();
        EntidadeConstructor typeInvalido = EntidadeFactory.EntidadeOK();
        EntidadeConstructor semCpf = EntidadeFactory.EntidadeOK();
        EntidadeConstructor cpfInvalido = EntidadeFactory.EntidadeOK();
        EntidadeConstructor semTelefone = EntidadeFactory.EntidadeOK();
        semEmail.setEmail("");
        emailInvalido.setEmail("teste");
        semPassword.setPassword("");
        passwordInvalido.setPassword("1234567890");
        semType.setType("");
        typeInvalido.setType("teste");
        semCpf.setCpf_cnpj("");
        cpfInvalido.setCpf_cnpj("12345678901234567890");
        semTelefone.setPhone1("");


        return new Object[][] { {semEmail}, {emailInvalido}, {semPassword}, {passwordInvalido}, {semType},
                {typeInvalido}, {semCpf}, {cpfInvalido}, {semTelefone}};
    }
}
