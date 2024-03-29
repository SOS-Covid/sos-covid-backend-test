package constructors;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserConstructor {

    private String email;
    private String password;
    private String cpf_cnpj;
    private String phone1;
    private String type;
    private String first_name;
    private String last_name;
}

