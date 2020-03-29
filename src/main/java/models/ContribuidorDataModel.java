package models;

import constructors.AssistenciadoConstructor;
import constructors.EnderecoConstructor;
import constructors.MetodoPagamentoConstructor;

import java.util.List;

public class ContribuidorDataModel {

    private boolean acceptedDonate;
    private int value;
    private boolean status;
    private List<EnderecoConstructor> address;
    private List<MetodoPagamentoConstructor> payment_methods;
    private List<String> description;
    private List<AssistenciadoConstructor> assisted_entities;
    private List<String> served_region;
    private List<String> help_types;
    private String id;
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
    private String registredAt;
    private String lastAcess;
    private String group_finality;
    private int goal;
    private int v;
}