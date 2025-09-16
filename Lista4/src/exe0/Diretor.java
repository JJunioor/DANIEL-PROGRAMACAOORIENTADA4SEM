package exe0;

public class Diretor extends Funcionario {
    private float acoesEmpresa;

    public Diretor(float acoesEmpresa) {
        super();
    }

    public Diretor(String name, String endereco, String cpf, double salario, float acoesEmpresa) {
        super(name, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                super.toString() + "acoesEmpresa=" + acoesEmpresa +
                '}';
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario() + (this.acoesEmpresa * 3.14f)/12;
    }
}