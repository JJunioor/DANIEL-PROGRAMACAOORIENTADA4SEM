package br.edu.fatecfranca.ExemploAPI.model;

public class Produto {
    private int ID;
    private String nome;
    private float preco;
    private int qtde;

    public Produto() {
    }

    public Produto(int ID, String nome, float preco, int qtde) {
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}


