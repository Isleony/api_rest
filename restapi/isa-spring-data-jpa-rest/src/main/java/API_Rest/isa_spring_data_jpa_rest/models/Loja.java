package API_Rest.isa_spring_data_jpa_rest.models;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Loja {
    private int codigo;
    private String nome;
    private boolean inativo;


}
