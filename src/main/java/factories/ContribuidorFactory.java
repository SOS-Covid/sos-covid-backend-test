package factories;

import constructors.ContribuidorConstructor;
import constructors.EnderecoConstructor;

import static utils.UtilConstants.CONTRIBUIDOR;
import static utils.UtilsTest.generateValidEmail;

public class ContribuidorFactory {

    private static String validEmail;

    public static ContribuidorConstructor ContribuidorOK() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                status(Boolean.FALSE).
                build();
    }

    public static ContribuidorConstructor ContribuidorMultiEnderecosOK() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                address(endereco).
                status(Boolean.FALSE).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamEmail() {
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                status(Boolean.FALSE).
                build();
    }

    public static ContribuidorConstructor ContribuidorEmailVazio() {
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email("").
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                status(Boolean.FALSE).
                build();
    }

    public static ContribuidorConstructor ContribuidorMaskEmailInvalida() {
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email("teste@teste").
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                status(Boolean.FALSE).
                build();
    }

    public static ContribuidorConstructor ContribuidorCpfCnpjVazio() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                status(Boolean.FALSE).
                build();
    }

    public static ContribuidorConstructor ContribuidorPhoneVazio() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("02100022087").
                phone1("").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                status(Boolean.FALSE).
                build();
    }

    public static ContribuidorConstructor ContribuidorStatusAtivo() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("02100022087").
                phone1("").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                status(Boolean.TRUE).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamStatus() {
        validEmail = generateValidEmail();
        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("02100022087").
                phone1("").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                build();
    }
}
