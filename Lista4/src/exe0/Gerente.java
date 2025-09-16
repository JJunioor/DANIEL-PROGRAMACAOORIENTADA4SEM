package exe0;

public class Gerente extends Funcionario {
    private float bonus;

    public Gerente() {
        super();
    }

    public Gerente(String name, String endereco, String cpf, double salario, float bonus) {
        super(name, endereco, cpf, salario);
        this.bonus = bonus;

    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() { //primeiro procura na própria classe e se não achar, busca na classe pai
        return "Gerente{" +
                "bonus=" +  super.toString()+ bonus +
                '}';
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario() + this.bonus;
    }
}
