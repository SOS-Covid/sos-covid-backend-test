package factories;

import constructors.AssistenciadoConstructor;
import constructors.EnderecoConstructor;
import constructors.EntidadeConstructor;
import constructors.MetodoPagamentoConstructor;
import lombok.SneakyThrows;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static utils.UtilConstants.ENTIDADE;
import static utils.UtilConstants.IMAGE_USER;
import static utils.UtilsTest.encondeImageBase64;
import static utils.UtilsTest.generateValidEmail;

public class EntidadeFactory {

    private static String validEmail, image;
    private static List<String> listHelpTypes = Arrays.asList("Help1", "Help2");
    private static List<String> listServedRegion = Arrays.asList("Region 1", "Region 2");

    private static EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
    private static AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();
    private static MetodoPagamentoConstructor metodoPagamento = MetodoPagamentoFactory.PagtoMetodoOK();

    
    public static EntidadeConstructor EntidadeOK() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
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
                image(image).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamEmail() throws IOException {
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamPassword() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamType() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamLastName() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamNameOrganization() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamCpfCnpj() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamPhone1() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamSite() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamInstagram() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamFacebook() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamGroupFinality() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamAcceptDonate() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamFirstName() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamAdress() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeAdressIncompleto() throws IOException {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoIcompleto();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamHelpTypes() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamServedRegions() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

   public static EntidadeConstructor EntidadeSemParamPaymentMethod() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamDescription() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamImage() {
        validEmail = generateValidEmail();

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                cpf_responsible("12327026000000").
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

    public static EntidadeConstructor EntidadeSemParamCpfResponsible() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                phone2("51 99999999").
                image(image).
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

    public static EntidadeConstructor EntidadeSemParamPhone2() throws IOException {
        validEmail = generateValidEmail();
        image = encondeImageBase64(IMAGE_USER);

        return EntidadeConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                cpf_responsible("12327026000000").
                image(image).
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