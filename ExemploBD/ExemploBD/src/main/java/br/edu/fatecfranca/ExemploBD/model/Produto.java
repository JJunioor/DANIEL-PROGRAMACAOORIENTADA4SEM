package br.edu.fatecfranca.ExemploBD.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // a classe é uma entidade do banco de dados
@Table(name = "tb_produto") // a tabela no banco se chamará tb_produto

public class Produto {
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerada automaticamente

    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    //private int qtde;

    // Construtor padrão (obrigatório para o JPA)
    public Produto() {}

    // Construtor com parâmetros (opcional)
    public Produto(String nome, String descricao, Double preco /*int qtde*/) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        //this.qtde = qtde;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    /*
    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }*/
}

