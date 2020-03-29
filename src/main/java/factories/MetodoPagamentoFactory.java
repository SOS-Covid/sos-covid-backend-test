package factories;

import constructors.MetodoPagamentoConstructor;

public class MetodoPagamentoFactory {

    public static MetodoPagamentoConstructor PagtoMetodoOK() {
        return MetodoPagamentoConstructor.builder().
                paypal("link1").
                sicredi("link2").
                getnet("link3").
                recebeaqui("link4").
                build();
    }
}
