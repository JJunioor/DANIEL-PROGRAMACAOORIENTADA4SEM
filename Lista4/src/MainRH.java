import exe0.Assistente;
import exe0.Gerente;
import exe0.Diretor;
import exe0.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class MainRH {

    public static void exibir(Funcionario funcionario) {
        //o objeto funcionario vai executar o metodo to.String() de qual classe
        //depende da classe que for passada como parâmetro quando da chamada
        //se for passado um assistente, executa toString() do Assistente
        //se for passado um gerente, executa toString() do Gerente
        //se for passado um diretor, executa toString() do Diretor
        System.out.println(funcionario.toString());
    }
    public static void main(String[] args) {

        Funcionario fu1 = new Funcionario();
        //fu1 vai ter um comportamento polimórfico

        //fu1 = new Assistente("Pedro", "Franca", "123.456.789-0", 2000, 3);
        //exibir(fu1);

        Assistente as1 = new Assistente("Pedro", "Franca", "123.456.789-0", 2000, 3);
        //exibir();
        System.out.println("-".repeat(100));

        //fu1 = new Gerente("Andrea", "Franca", "1234", 4000, 1000);
        //exibir(fu1);

        Gerente ge1 = new Gerente("Andrea", "Franca", "1234", 4000, 1000);
        //exibir(ge1);
        System.out.println("-".repeat(100));

        //fu1 = new Diretor("Alex", "Franca", "12654", 6000, 1200);
        //exibir(fu1);

        Diretor di1 = new Diretor("Alex", "Franca", "12654", 6000, 1200);
        //exibir(di1);
        System.out.println("-".repeat(100));

        //cria um vetor de funcionários
        //List<Funcionario> funcionarios = new ArrayList<>();
        //funcionarios.add(as1);
        //funcionarios.add(ge1);
        //funcionarios.add(di1);

        //calcula folha de pagto
        //percorre o vetor e soma os salários
        double total = 0;
        for(Funcionario objFunc : funcionarios) { //objFunc vai iterar em funcionarios
            total += objFunc.calculaSalario(); // objFunc é polifórmico
        }
        System.out.println("Total de salários: " + total);

    }
}