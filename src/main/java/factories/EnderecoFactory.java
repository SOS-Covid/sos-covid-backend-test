package factories;

import com.github.javafaker.Faker;
import constructors.EnderecoConstructor;

import static utils.UtilConstants.EN_US;

public class EnderecoFactory {

    private static Faker generate = new Faker(EN_US);

    public static EnderecoConstructor EnderecoOK() {
        return EnderecoConstructor.builder().
                street(generate.address().streetName()).
                number(Integer.parseInt(generate.address().buildingNumber())).
                complement(generate.address().streetSuffix()).
                district("Centro").
                city("Porto Alegre").
                state("RS").
                country("Brasil").
                postal_code(generate.address().zipCode()).
                build();
    }

    public static EnderecoConstructor EnderecoIcompleto() {
        return EnderecoConstructor.builder().
                street(generate.address().streetName()).
                number(Integer.parseInt(generate.address().buildingNumber())).
                complement(generate.address().streetSuffix()).
                district("Centro").
                city("Porto Alegre").
                build();
    }
}
