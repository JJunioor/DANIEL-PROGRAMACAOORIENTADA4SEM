import exe0.Assistente;
import exe0.Diretor;
import exe0.Funcionario;
import exe0.Gerente;

import java.util.ArrayList;
import java.util.List;

public class MainRH {
        public static void exibir(Funcionario funcionario){
            // O objeto vai executar o método toString() de qual classe?
            // Depende da classe que for passada como parâmetro quando da chamada
            // Se for passado um assistente , execute toString() do Assistente
            // Se for passado um Gerente, execute toString() do gerente
            // Se for passado um diretor, executa toString() do Diretor
            System.out.println(funcionario.toString());
        }
        public static void main(String[] args)
        {

            System.out.println("-".repeat(80));
            Assistente ass1 =
                    new Assistente("Andriele", "Franca", "142.901.518-76", 2000, 15);
            //System.out.println(fu1.toString()); //Fu1 executa o toString() do assistente
            exibir(ass1);
            System.out.println("-".repeat(80));

            Funcionario fu1 =
                    new Funcionario("Andrea", "Franca","152.802.527-86",1025);
            exibir(fu1);
            //System.out.println("-".repeat(80));

            Gerente ge1 =
                    new Gerente("Maria","Miami", "445.069.824-51", 3000, 1500 );
            exibir(ge1);
            System.out.println("-".repeat(80));

            Diretor dt1 =
                    new Diretor ("Jalisson","New York", "446.026.728-41", 150000, 1500 );
            exibir(dt1);
            System.out.println("-".repeat(80));

            //Criar um vetor de funcionários
            List<Funcionario> funcionarios = new ArrayList<>();
            funcionarios.add(ass1);
            funcionarios.add(ge1);
            funcionarios.add(dt1);
            //calcula folha de pgto
            //percorre o vetor e soma os salários
            double total = 0;
            for (Funcionario objFunc : funcionarios){
                total += objFunc.calculaSalario(); //objfunc é polimórfico
            }
            System.out.println("Total dos salários:" + total);
        }
}
