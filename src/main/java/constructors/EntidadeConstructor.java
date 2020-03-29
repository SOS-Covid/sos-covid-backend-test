package constructors;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class EntidadeConstructor {
    private String email;
    private String password;
    private String cpf_cnpj;
    private String phone1;
    private String type;
    private String site;
    private String instagram;
    private String facebook;
    private String name_organization;
    private String first_name;
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
}