package exe01;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Não deve ter chaves, não deve descrever nada pois é abstrato e serve de base para outras classes
    public abstract double calcularSalario();

    //Metodo concreto exibir info
    @Override
    public String toString() {
        return "\nFuncionario{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                " salário final=" + calcularSalario() +
                '}';
    }
}