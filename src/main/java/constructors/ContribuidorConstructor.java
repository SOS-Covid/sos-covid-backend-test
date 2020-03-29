package constructors;

import lombok.*;
import org.testng.annotations.Optional;

import java.util.ArrayList;
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
    private Boolean status;
}

