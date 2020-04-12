package factories;

import com.github.javafaker.Faker;
import constructors.AssistenciadoConstructor;

import static utils.UtilConstants.EN_US;

public class AssistenciadoFactory {

    private static Faker generate = new Faker(EN_US);

    public static AssistenciadoConstructor AssistenciadoCompleto() {
        return AssistenciadoConstructor.builder().
                name("Assistenciado").
                street(generate.address().streetName()).
                number(Integer.parseInt(generate.address().streetAddressNumber())).
                complement(generate.address().streetSuffix()).
                district("Centro").
                city("Porto Alegre").
                state("RS").
                country("Brasil").
                postal_code(generate.address().zipCode()).
                build();
    }
}
