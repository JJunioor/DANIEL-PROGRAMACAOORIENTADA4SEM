package exe0;

import java.text.DecimalFormat;

public class Diretor extends Funcionario{
    private double acoesEmpresa;

    public Diretor(){
        super();
    }

    public Diretor(String nome, String endereco, String cpf, double salario, double acoes) {
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    public double getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(double acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                super.toString() + "acoesEmpresa=" + acoesEmpresa +
                '}';
    }

    public double calculaSalario(){
        DecimalFormat df = new DecimalFormat("#.00");
        return (super.calculaSalario() + Math.round(( this.acoesEmpresa * 3.14f) / 12));
    }
}
