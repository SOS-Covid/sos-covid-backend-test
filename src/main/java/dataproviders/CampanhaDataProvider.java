package dataproviders;

import constructors.CampanhaConstructor;
import factories.CampanhaFactory;
import org.testng.annotations.DataProvider;

public class CampanhaDataProvider {

    @DataProvider(name = "Required-BlankFields")
    public static Object[][] dataProviderRequiredBlankFields() {
        CampanhaConstructor semParamCampaingName = CampanhaFactory.CampanhaSemParamCampaingName();
        CampanhaConstructor semParamReferenceUser = CampanhaFactory.CampanhaSemParamReferenceUser();
        CampanhaConstructor semParamDescription = CampanhaFactory.CampanhaSemParamDescription();
        CampanhaConstructor semParamAssistedEntity = CampanhaFactory.CampanhaSemParamAssistedEntity();
        CampanhaConstructor semParamState = CampanhaFactory.CampanhaSemParamState();
        CampanhaConstructor semParamCity = CampanhaFactory.CampanhaSemParamCity();
        CampanhaConstructor semParamInitialDate = CampanhaFactory.CampanhaSemParamInitialDate();
        CampanhaConstructor semParamFinalDate = CampanhaFactory.CampanhaSemParamFinalDate();
        CampanhaConstructor semParamStatus = CampanhaFactory.CampanhaSemParamStatus();
        CampanhaConstructor campaingNameVazio = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor referenceUserVazio = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor referenceUserInvalido = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor referenceUserInexistente = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor descriptionVazio = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor assitedEntityVazio = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor stateVazio = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor cityVazio = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor initialDateVazio = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor finalDateVazio = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor statusVazio = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor statusInvalido = CampanhaFactory.CampanhaAtivaOK();
        campaingNameVazio.setCampaign_name("");
        referenceUserVazio.setReference_user("");
        referenceUserInvalido.setReference_user("123");
        referenceUserInexistente.setReference_user("bimba@bomba.com");
        descriptionVazio.setDescription("");
        assitedEntityVazio.setAssisted_entity("");
        stateVazio.setState("");
        cityVazio.setCity("");
        initialDateVazio.setInitial_date("");
        finalDateVazio.setFinal_date("");
        stateVazio.setStatus("");
        statusVazio.setStatus("");
        statusInvalido.setStatus("ABC");


        return new Object[][]{{semParamCampaingName}, {semParamAssistedEntity}, {semParamCity}, {semParamDescription}, {semParamFinalDate},
                {semParamInitialDate}, {semParamReferenceUser}, {semParamState}, {semParamStatus}, {campaingNameVazio}, {referenceUserVazio},
                {referenceUserInvalido}, {descriptionVazio}, {assitedEntityVazio}, {stateVazio}, {cityVazio}, {initialDateVazio},
                {finalDateVazio}, {statusVazio}, {statusInvalido}, {referenceUserInexistente}};
    }

    @DataProvider(name = "OptionalFields")
    public static Object[][] dataProviderOptionalFields() {
        CampanhaConstructor campanhaAtiva = CampanhaFactory.CampanhaAtivaOK();
        CampanhaConstructor campanhaCancelada = CampanhaFactory.CampanhaCanceladaOK();
        CampanhaConstructor campanhaFechada = CampanhaFactory.CampanhaFechadaOK();
        CampanhaConstructor semParamTypesDonation = CampanhaFactory.CampanhaSemParamTypeDonations();
        CampanhaConstructor semParamServedRegions = CampanhaFactory.CampanhaSemParamServedRegions();
        CampanhaConstructor semParamDonateChannels = CampanhaFactory.CampanhaSemParamDonateChannels();

        return new Object[][]{{campanhaAtiva}, {campanhaCancelada}, {campanhaFechada},
                {semParamTypesDonation}, {semParamServedRegions}, {semParamDonateChannels}};
    }
}
