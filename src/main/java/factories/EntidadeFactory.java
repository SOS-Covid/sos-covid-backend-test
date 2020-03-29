package factories;

import constructors.AssistenciadoConstructor;
import constructors.EnderecoConstructor;
import constructors.EntidadeConstructor;

import java.util.Random;

import static utils.UtilConstants.ENTIDADE;

public class EntidadeFactory {

    public static EntidadeConstructor EntidadeOK() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamEmail() {
        Random r = new Random();
        int x = r.nextInt();

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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeEmailVazio() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeMaskEmailInvalida() {

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste@teste").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamPassword() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadePasswordVazio() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
                password("").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamType() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeTypeVazio() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type("").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeTypeInvalido() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
                password("teste123").
                cpf_cnpj("63027026000143").
                phone1("51 33333333").
                type("type").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamFirstName() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamLastName() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamNameOrganization() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamCpfCnpj() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeCpfCnpjVazio() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
                password("teste123").
                cpf_cnpj("").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeCpfCnpjInvalidSize() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
                password("teste123").
                cpf_cnpj("01234567890123456789").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamPhone1() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamSite() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamInstagram() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamFacebook() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamGroupFinality() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }

    public static EntidadeConstructor EntidadeSemParamAcceptDonate() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
        AssistenciadoConstructor assistenciado = AssistenciadoFactory.AssistenciadoCompleto();

        return EntidadeConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
                status(Boolean.TRUE).
                build();
    }
}
