package br.edu.fatecfranca.ExemploAPI.controller;

import br.edu.fatecfranca.ExemploAPI.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/produto")

//Estamos usando um padrão de MVC = Model View Controller
// Usuárion-> View -> Controller -> Model -> Banco de Dados --|
//                   Usuário <- View <- Controller <- Model <-|

//Classe vai responder pelas requisições /mensagem
public class ExemploController {
    List<Produto> produtos = new ArrayList<>();

    /* Primeiro exemplo
    Verbo GET
    @GetMapping()
    // public String consulta(){
        return "Este metodo faz um select no banco de dados";
    }*/

    // Exemplo com Vetor criado
    // Verbo get
    @GetMapping
    public List<Produto> consulta(){
        return produtos;
    }

    /*/Verbo GET
    @GetMapping ("/{nome}/{sobrenome}")
    public String consultaPersonalizada(@PathVariable String nome, @PathVariable String sobrenome){
        return "Também faz select, mas agora com a cláusula where " + nome + "  " + sobrenome;
    }*/

    //Verbo GET
    @GetMapping ("/{ID}")
    public Produto consultaPersonalizada(@PathVariable int ID){
        for (Produto produto: produtos){
            if (produto.getID() == ID){
                return produto;
            }
        }
        // Não encontrou
        return null;
    }

    /*//Verbo POST
    @PostMapping
    public String insere(@RequestBody Produto produto){
        return "Este método faz um insert no banco de dados";
    }*/

    //Verbo Post
    @PostMapping
    public Produto insere(@RequestBody Produto produto){
        produtos.add(produto);
        return produto;

    }

    @DeleteMapping("/{id}")
    public boolean remover(@PathVariable int id){
        for (Produto produto : produtos ){
            if (produto.getID() == id){
                return produtos.remove(produto);
            }
        }
        //Não encontrou
        return false;
    }

}
