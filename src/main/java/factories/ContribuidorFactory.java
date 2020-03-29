package factories;

import constructors.ContribuidorConstructor;
import constructors.EnderecoConstructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

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
                address(Arrays.asList(endereco)).
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
                address(Arrays.asList(endereco, endereco)).
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
                address(Arrays.asList(endereco)).
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
                address(Arrays.asList(endereco)).
                status(Boolean.TRUE).
                build();
    }
}
