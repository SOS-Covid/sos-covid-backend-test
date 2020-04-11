package constructors;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
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

