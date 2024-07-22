package API_Rest.isa_spring_data_jpa_rest.services;

import API_Rest.isa_spring_data_jpa_rest.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProdutoService {
    public List<Produto> findAll() {
        List<Produto> listProduto = new ArrayList<>();

        Produto produto1 = new Produto(1, "Produto 1", new Date(), "1234567890123", false);
        Produto produto2 = new Produto(2, "Produto 2", new Date(), "1234567890124", true);
        Produto produto3 = new Produto(3, "Produto 3", new Date(), "123345332", false);

        listProduto.add(produto1);
        listProduto.add(produto2);
        listProduto.add(produto3);

        return listProduto;
    }
    public void inserir(Produto produto){
        System.out.println("Inserido: " + produto);
    }

    public void alterar(Produto produto){
        System.out.println("Alterado: " + produto);
    }

    public void excluir(Long id){
        System.out.println("Deletado: " + id);


    }
}
