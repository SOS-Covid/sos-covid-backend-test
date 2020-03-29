package constructors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
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

