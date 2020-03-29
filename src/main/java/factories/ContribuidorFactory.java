package factories;

import constructors.ContribuidorConstructor;
import constructors.EnderecoConstructor;

import java.util.Random;

import static utils.UtilConstants.CONTRIBUIDOR;

public class ContribuidorFactory {

    public static ContribuidorConstructor ContribuidorOK() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                status(Boolean.TRUE).
                build();
    }

    public static ContribuidorConstructor ContribuidorMultiEnderecosOK() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                address(endereco).
                status(Boolean.TRUE).
                build();
    }

    public static ContribuidorConstructor ContribuidorSemParamEmail() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                password("teste123").
                cpf_cnpj("029234344334").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                status(Boolean.TRUE).
                build();
    }

    public static ContribuidorConstructor ContribuidorEmailVazio() {
        Random r = new Random();
        int x = r.nextInt();

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
                status(Boolean.TRUE).
                build();
    }

    public static ContribuidorConstructor ContribuidorMaskEmailInvalida() {
        Random r = new Random();
        int x = r.nextInt();

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
                status(Boolean.TRUE).
                build();
    }

    public static ContribuidorConstructor ContribuidorCpfCnpjVazio() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
                password("teste123").
                cpf_cnpj("").
                phone1("51 33333333").
                type(CONTRIBUIDOR).
                first_name("Teste A").
                last_name("Teste B").
                address(endereco).
                status(Boolean.TRUE).
                build();
    }

    public static ContribuidorConstructor ContribuidorPhoneVazio() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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

    public static ContribuidorConstructor ContribuidorInativo() {
        Random r = new Random();
        int x = r.nextInt();

        EnderecoConstructor endereco = EnderecoFactory.EnderecoOK();

        return ContribuidorConstructor.builder().
                email("teste" + Integer.toString(x) + "@teste.com").
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
}
