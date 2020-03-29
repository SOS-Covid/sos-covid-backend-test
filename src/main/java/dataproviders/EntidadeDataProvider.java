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

    @DataProvider(name = "semRequiredFields")
    public static Object[][] dataProviderSemRequiredFields()
    {
        EntidadeConstructor semParamEmail = EntidadeFactory.EntidadeSemParamEmail();
        EntidadeConstructor semParamPassword = EntidadeFactory.EntidadeSemParamPassword();
        EntidadeConstructor semParamType = EntidadeFactory.EntidadeSemParamType();
        EntidadeConstructor semParamCpf = EntidadeFactory.EntidadeSemParamCpfCnpj();

        return new Object[][] { {semParamEmail}, {semParamPassword}, {semParamType}, {semParamCpf} };
    }

    @DataProvider(name = "OptionalFields")
    public static Object[][] dataProviderOptionalFields()
    {
        EntidadeConstructor entidadeCompleta = EntidadeFactory.EntidadeOK();
        EntidadeConstructor semParamSite = EntidadeFactory.EntidadeSemParamSite();
        EntidadeConstructor semParamInstaagram = EntidadeFactory.EntidadeSemParamInstagram();
        EntidadeConstructor semParamFacebook = EntidadeFactory.EntidadeSemParamFacebook();
        EntidadeConstructor semParamNameOrganization = EntidadeFactory.EntidadeSemParamNameOrganization();
        EntidadeConstructor semParamFirstName = EntidadeFactory.EntidadeSemParamFirstName();
        EntidadeConstructor semParamLastName = EntidadeFactory.EntidadeSemParamLastName();
        EntidadeConstructor semParamGroupFinality = EntidadeFactory.EntidadeSemParamGroupFinality();
        EntidadeConstructor semParamAddress = EntidadeFactory.EntidadeSemParamAdress();
        EntidadeConstructor semAddressIncompleto = EntidadeFactory.EntidadeAdressIncompleto();
        EntidadeConstructor semParamHelpTypes = EntidadeFactory.EntidadeSemParamHelpTypes();
        EntidadeConstructor semParamServedRegion = EntidadeFactory.EntidadeSemParamServedRegions();
        EntidadeConstructor semParamPaymentMethods = EntidadeFactory.EntidadeSemParamPaymentMethod();
        EntidadeConstructor semParamDescription = EntidadeFactory.EntidadeSemParamDescription();
        EntidadeConstructor semParamAcceptDonate = EntidadeFactory.EntidadeSemParamAcceptDonate();


        return new Object[][] { {entidadeCompleta},
                {semParamSite}, {semParamInstaagram}, {semParamFacebook}, {semAddressIncompleto},
                {semParamNameOrganization}, {semParamFirstName}, {semParamLastName}, {semParamGroupFinality},
                {semParamAddress}, {semParamAcceptDonate}, {semParamHelpTypes},
                {semParamServedRegion}, {semParamPaymentMethods}, {semParamDescription} };
    }
}
