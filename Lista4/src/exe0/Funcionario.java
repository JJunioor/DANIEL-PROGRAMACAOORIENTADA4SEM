package exe0;

public class Funcionario {
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected double salario;

    //construtor sem parametro
    public Funcionario() {
    }

    //construtor com parametro
    public Funcionario(String nome, String endereco, String cpf, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
    }

    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //toString


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", endereço='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + this.calculaSalario() +
                '}';
    }

    public double calculaSalario(){
        return this.salario;
    }
}