package API_Rest.isa_spring_data_jpa_rest.controllers;

import API_Rest.isa_spring_data_jpa_rest.models.Produto;
import API_Rest.isa_spring_data_jpa_rest.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que esta classe é um controlador REST
@RequestMapping("/api/v1/produtos") // Define o mapeamento da URL base
public class ProdutoController {

    @Autowired // Injeta o serviço ProdutoService
    private ProdutoService produtoService;

    @GetMapping // Mapeia as solicitações GET para o método listar
    public List<Produto> listar() {
        return produtoService.findAll();
    }

    @PostMapping //SABIA QUE QUANDO TEM UM POST, NÓS RETORNOS 201 (created)?
    @ResponseStatus( HttpStatus.CREATED)
    public void inserir(@RequestBody Produto produto){
        produtoService.inserir(produto); //vai bater no Service, quando inserir, ele vai mostrar no console que foi inserido
    }
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody Produto produto){
        produtoService.alterar(produto);
    }

    @DeleteMapping
    @RequestMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Long id){
        produtoService.excluir(id);
    }
}
