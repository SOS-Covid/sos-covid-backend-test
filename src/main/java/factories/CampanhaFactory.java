package factories;

import constructors.CampanhaConstructor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static utils.UtilsTest.getOrganizationEmail;

public class CampanhaFactory {

    private static DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    private static String organizationMail;
    private static List<String> listServedRegion = Arrays.asList("Region 1", "Region 2");
    private static List<String> listDonations = Arrays.asList("Alcool", "Cesta Basica", "Leito");
    private static List<String> listCanais = Arrays.asList("Canal 1", "Canal 2", "Canal 3");
    private static String dataInicial = LocalDate.now().plusDays(5).format(formatDate);
    private static String dataFinal = LocalDate.now().plusMonths(2).format(formatDate);

    public static CampanhaConstructor CampanhaAtivaOK() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("Medicos").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaFechadaOK() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("Medicos").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("CLOSED").
                build();
    }

    public static CampanhaConstructor CampanhaCanceladaOK() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("Medicos").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("CANCELED").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamCampaingName() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("Medicos").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamReferenceUser() {

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                description("Descrição 1234567").
                assisted_entity("Medicos").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamDescription() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                assisted_entity("Medicos").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamAssistedEntity() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamTypeDonations() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("029234344334").
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamState() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("029234344334").
                type_donations(listDonations).
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamCity() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("029234344334").
                type_donations(listDonations).
                state("RS").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamServedRegions() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("029234344334").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamInitialDate() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("029234344334").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                final_date(dataFinal).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamFinalDate() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("029234344334").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                donate_channels(listCanais).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamDonateChannels() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("029234344334").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                status("ACTIVE").
                build();
    }

    public static CampanhaConstructor CampanhaSemParamStatus() {
        organizationMail = getOrganizationEmail();

        return CampanhaConstructor.builder().
                campaign_name("Campanha Teste 1").
                reference_user(organizationMail).
                description("Descrição 1234567").
                assisted_entity("029234344334").
                type_donations(listDonations).
                state("RS").
                city("Porto Alegre").
                served_region(listServedRegion).
                initial_date(dataInicial).
                final_date(dataFinal).
                donate_channels(listCanais).
                build();
    }
}
