package br.edu.fatecfranca.ExemploBD.service;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
/*Responsável pelas regras de negócios da aplicação*/
public class ProdutoService {

    //Injeção de dependência
    // Usar um objeto para chamar um metodo sem precisar
    // instância-lo
    @Autowired
    private ProdutoRepository produtoRepository;

    //Metodo que consulta todos os produtos
    public List<Produto> listaTodos(){
        // select * from tb_produto
        return produtoRepository.findAll();
    }

    //Método que consulta um produto em particular
    public Optional<Produto> listaPorId(Long id){
        //Se o findbyId() enontrar um produto, retorna ele
        //Se o findbyId() não encontrar, retorna null
        //select * from tb_produto where tb_produto.id = id
        return produtoRepository.findById(id);
    }

    //Método para inserir um produto na tabela tb_produto
    public Produto insere (Produto produto){
        //insert into tb_produto values (...)
        return produtoRepository.save(produto);
    }

    //Método para remover um produto da tabela tb_produto
    public boolean remover(Long id){
        // delete from tb_produto where tb_produto.id = 1
        if (produtoRepository.existsById(id)){ //Verifica se o produto existe
            produtoRepository.deleteById(id); //Remove o produto
            return true;
        }
        return false; //Não encontrou
    }

    //Método para atualizar um produto já inserido
    public Produto editarProduto(Long id, Produto novoProduto){
        //novoProduto não tem Id
        if (produtoRepository.existsById(id)){ //Verifica se o produto existe
            novoProduto.setId(id); //atualizo o novoProduto com o id
            return produtoRepository.save(novoProduto); // Salva o produto atualizado
        }
        return null; //Caso o produto não exista
    }
}
