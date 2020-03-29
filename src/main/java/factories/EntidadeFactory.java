package factories;

import constructors.AssistenciadoConstructor;
import constructors.EnderecoConstructor;
import constructors.EntidadeConstructor;
import constructors.MetodoPagamentoConstructor;

import java.util.Arrays;
import java.util.List;

import static utils.UtilConstants.ENTIDADE;
import static utils.UtilsTest.generateValidEmail;

public class EntidadeFactory {

    private static String validEmail;
    private static List<String> listHelpTypes = Arrays.asList("Help1", "Help2");
    private static List<String> listServedRegion = Arrays.asList("Region 1", "Region 2");

    private static EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
    private static AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();
    private static MetodoPagamentoConstructor metodoPagamento = MetodoPagamentoFactory.PagtoMetodoOK();

    public static EntidadeConstructor EntidadeOK() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamEmail() {

        return EntidadeConstructor.builder().
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamPassword() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamType() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamLastName() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamNameOrganization() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamCpfCnpj() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamPhone1() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamSite() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamInstagram() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamFacebook() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamGroupFinality() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamAcceptDonate() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamStatus() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamFirstName() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamAdress() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeAdressIncompleto() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoIcompleto();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamHelpTypes() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamServedRegions() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamAssitedEntities() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamPaymentMethod() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                description("É uma entidade que ajuda as pessoas com aquilo que elas precisam").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamDescription() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type(ENTIDADE).
                site("wwww.google.com").
                instagram("wwww.google.com").
                facebook("wwww.google.com").
                name_organization("Entidade Teste").
                first_name("Teste A").
                last_name("Teste B").
                group_finality("Teste").
                goal(20).
                help_types(listHelpTypes).
                served_region(listServedRegion).
                payment_methods(Arrays.asList(metodoPagamento)).
                address(Arrays.asList(endereco)).
                assisted_entities(Arrays.asList(assistenciado)).
                accepted_donate(Boolean.TRUE).
                build();
    }
}