package factories;

import constructors.AssistenciadoConstructor;

public class AssistenciadoFactory {

    public static AssistenciadoConstructor AssistenciadoCompleto() {
        return AssistenciadoConstructor.builder().
                name("Assistenciado").
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
}
