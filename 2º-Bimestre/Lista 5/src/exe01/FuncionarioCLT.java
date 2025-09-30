package exe01;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT() {
        super();
    }

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + (this.salarioBase * 0.1);
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "Contrato= CLT " +
                " ,nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                " salário final=" + calcularSalario() +
                '}';
    }
}
