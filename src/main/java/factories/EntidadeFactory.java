package factories;

import constructors.AssistenciadoConstructor;
import constructors.EnderecoConstructor;
import constructors.EntidadeConstructor;

import java.util.Random;

import static utils.UtilConstants.ENTIDADE;
import static utils.UtilsTest.generateValidEmail;

public class EntidadeFactory {

    private static String validEmail;

    public static EntidadeConstructor EntidadeOK() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamEmail() {
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamPassword() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamType() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamLastName() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamNameOrganization() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamCpfCnpj() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamPhone1() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamSite() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamInstagram() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamFacebook() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamGroupFinality() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                goal(20).
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamAcceptDonate() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                status(Boolean.FALSE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamStatus() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

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
                help_type("Help Type 1").
                help_type("Help Type 2").
                help_type("Help Type 2").
                served_region("Served Region 1").
                served_region("Served Region 2").
                served_region("Served Region 3").
                address(endereco).
                assisted_entities(assistenciado).
                accepted_donate(Boolean.TRUE).
                build();
    }
}
