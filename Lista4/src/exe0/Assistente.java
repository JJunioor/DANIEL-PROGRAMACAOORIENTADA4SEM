package exe0;

public class Assistente extends Funcionario{
    //Variavel que é da própria classe
    private double horaExtra;

    //Construtor já aproveitando o construtor
    // que fez no código do funcionário ( construtor )
    public Assistente(){
        super();
    }


    public Assistente(String nome, String endereco, String cpf, double salario, double horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(double horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                super.toString() + "horasExtras" + horaExtra +
                '}';
    }

    @Override
    public double calculaSalario(){
        return (this.salario + this.horaExtra * 50);
    }
}
