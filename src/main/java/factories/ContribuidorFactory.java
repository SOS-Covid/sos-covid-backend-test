package factories;

import constructors.ContribuidorConstructor;
import constructors.EnderecoConstructor;

import java.util.Arrays;

import static utils.UtilConstants.CONTRIBUIDOR;
import static utils.UtilsTest.generateValidEmail;

public class ContribuidorFactory {

    private static String validEmail;
    private static EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
    private static EnderecoConstructor enderecoInvalido = EnderecoFactory.EnderecoOK();

    public static ContribuidorConstructor ContribuidorOK() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorMultiEnderecosOK() {
        validEmail = generateValidEmail();
        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(Arrays.asList(endereco, endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamEmail() {

        return ContribuidorConstructor.builder().
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamPassword() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamType() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                first_name("Teste A").
                last_name("Teste B").
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamCpfCnpj() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamPhone1() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorStatusAtivo() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("02100022087").
                phone1("").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamFirstName() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                last_name("Teste B").
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamLastName() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorEnderecoInvalido() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(Arrays.asList(enderecoInvalido)).
                build();
    }
}
