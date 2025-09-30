package exe01;

public class FuncionarioPJ extends Funcionario{

    public FuncionarioPJ() {
        super();
    }

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "Contrato= PJ " +
                ", nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                " salário final=" + calcularSalario() +
                '}';
    }
}
