package factories;

import constructors.MetodoPagamentoConstructor;

public class MetodoPagamentoFactory {

    public static MetodoPagamentoConstructor PagtoMetodoOK() {
        return MetodoPagamentoConstructor.builder().
                paypal("link1").
                mercadopago("link2").
                vakinhaonline("link3").
                recebeaqui("link4").
                pagseguro("link5").
                build();
    }
}
