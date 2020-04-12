package factories;

import com.github.javafaker.Faker;
import constructors.UserConstructor;

import java.util.Locale;

import static utils.UtilConstants.*;
import static utils.UtilsTest.generateValidEmail;

public class UserFactory {

    private static String validEmail;
    private static Faker generate = new Faker(EN_US);

    public static UserConstructor userOK() {
        validEmail = generateValidEmail();

        return UserConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(ENTIDADE).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                build();
    }

    public static UserConstructor userSemParamEmail() {

        return UserConstructor.builder().
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(ENTIDADE).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                build();
    }

    public static UserConstructor userSemParamPassword() {
        validEmail = generateValidEmail();

        return UserConstructor.builder().
                email(validEmail).
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(ENTIDADE).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                build();
    }

    public static UserConstructor userSemParamType() {
        validEmail = generateValidEmail();

        return UserConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                build();
    }

    public static UserConstructor userSemParamCpfCnpj() {
        validEmail = generateValidEmail();

        return UserConstructor.builder().
                email(validEmail).
                password("teste123").
                phone1(generate.phoneNumber().phoneNumber()).
                type(ENTIDADE).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                build();
    }

    public static UserConstructor userSemParamPhone1() {
        validEmail = generateValidEmail();

        return UserConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                type(ENTIDADE).
                first_name(generate.name().firstName()).
                last_name(generate.name().lastName()).
                build();
    }

    public static UserConstructor userSemParamFirstName() {
        validEmail = generateValidEmail();

        return UserConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(ENTIDADE).
                last_name(generate.name().lastName()).
                build();
    }

    public static UserConstructor userSemParamLastName() {
        validEmail = generateValidEmail();

        return UserConstructor.builder().
                email(validEmail).
                password("teste123").
                cpf_cnpj("029234344334").
                phone1(generate.phoneNumber().phoneNumber()).
                type(ENTIDADE).
                first_name(generate.name().firstName()).
                build();
    }
}
