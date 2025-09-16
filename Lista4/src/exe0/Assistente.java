package exe0;

//extends: Assistente é filha de Funcionario
public class Assistente extends Funcionario {
    private double horaExtra;

    //construtor sem parametros, tem que digitar, super
    public Assistente(){
        super();
    }

    // chama construtor da super classe (com parametros)
    public Assistente(String nome, String endereco, String cpf, double salario, double horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    //toString
    //adicona o super.toString()+

    @Override
    public String toString() {
        return "Assistente{" +
                super.toString() + "horaExtra=" + horaExtra +
                '}';
    }

    @Override
    public double calculaSalario(){
        return(this.salario + this.horaExtra * 50);
    }

}
