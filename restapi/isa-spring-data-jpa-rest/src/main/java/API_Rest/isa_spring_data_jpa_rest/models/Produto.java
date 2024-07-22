package API_Rest.isa_spring_data_jpa_rest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Produto {
    private int codigo;
    private String descricao;
    private Date validade;
    private String ean;
    private boolean inativo;
    
}
