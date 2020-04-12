package factories;

import com.github.javafaker.Faker;
import constructors.ContribuidorConstructor;
import constructors.EnderecoConstructor;

import java.util.Arrays;

import static utils.UtilConstants.CONTRIBUIDOR;
import static utils.UtilConstants.EN_US;
import static utils.UtilsTest.generateValidEmail;

public class ContribuidorFactory {

    private static String validEmail;
    private static EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();
    private static EnderecoConstructor enderecoInvalido = EnderecoFactory.EnderecoOK();
    private static Faker generate = new Faker(EN_US);

    public static ContribuidorConstructor ContribuidorOK() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(CONTRIBUIDOR).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorMultiEnderecosOK() {
        validEmail = generateValidEmail();
        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(CONTRIBUIDOR).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                address(Arrays.asList(endereco, endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamEmail() {

        return ContribuidorConstructor.builder().
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(CONTRIBUIDOR).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamPassword() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(CONTRIBUIDOR).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamType() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamCpfCnpj() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                phone1(generate.phoneNumber().phoneNumber()).
                type(CONTRIBUIDOR).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
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
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
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
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamFirstName() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(CONTRIBUIDOR).
                last_name(generate.name().lastName()).
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamLastName() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(CONTRIBUIDOR).
                first_name(generate.name().firstName()).
                address(Arrays.asList(endereco)).
                build();
    }

    public static ContribuidorConstructor ContribuidorEnderecoInvalido() {
        validEmail = generateValidEmail();

        return ContribuidorConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(CONTRIBUIDOR).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                address(Arrays.asList(enderecoInvalido)).
                build();
    }
}
