package constructors;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Base64;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntidadeConstructor {
    private String email;
    private String password;
    private String cpf_cnpj;
    private String phone1;
    private String phone2;
    private String type;
    private String site;
    private String instagram;
    private String facebook;
    private String name_organization;
    private String social_reason;
    private String first_name;
    private String cpf_responsible;
    private String last_name;
    private String group_finality;
    private String description;
    private int goal;
    private Boolean accepted_donate;
    private List<EnderecoConstructor> address;
    private List<AssistenciadoConstructor> assisted_entities;
    private List<String> served_region;
    private List<String> help_types;
    private List<MetodoPagamentoConstructor> payment_methods;
    private String image;
}