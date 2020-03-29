package constructors;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class MetodoPagamentoConstructor {
    private String paypal;
    private String recebeaqui;
    private String getnet;
    private String sicredi;
}