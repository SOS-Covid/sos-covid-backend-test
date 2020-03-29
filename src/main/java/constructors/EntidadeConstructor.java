package constructors;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class EntidadeConstructor {
    private int id;
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
    private int goal;
    private EnderecoConstructor address;
    private AssistenciadoConstructor assisted_entities;
    private Boolean accepted_donate;
    private Boolean status;

    @Singular
    private List<String> help_types;
    @Singular
    private List<String> served_regions;
}

