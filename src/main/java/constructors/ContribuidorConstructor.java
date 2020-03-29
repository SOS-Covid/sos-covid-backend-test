package constructors;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ContribuidorConstructor {

    private String email;
    private String password;
    private String cpf_cnpj;
    private String phone1;
    private String type;
    private String first_name;
    private String last_name;
    private List<EnderecoConstructor> address;
}

