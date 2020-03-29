package factories;

import constructors.EnderecoConstructor;

public class EnderecoFactory {

    public static EnderecoConstructor EnderecoOK() {
        return EnderecoConstructor.builder().
                street("Rua Test").
                number(123).
                complement("ABC").
                district("Centro").
                city("Porto Alegre").
                state("RS").
                country("Brasil").
                postal_code("98430999").
                build();
    }

    public static EnderecoConstructor EnderecoIcompleto() {
        return EnderecoConstructor.builder().
                street("Rua Test").
                number(123).
                complement("ABC").
                district("Centro").
                city("Porto Alegre").
                build();
    }
}
