import exe1.Caminhao;
import exe1.Veiculo;
import exe1.Moto;
import exe1.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculos {
    //Pode chamar o método sem precisar da instância do objeto
    public static void exibir(Veiculo veiculo){
        System.out.println(veiculo.toString());
    }

    public static void main(String[] args) {

        System.out.println("\n" + "-".repeat(80) + "\n");
        Carro carro1 =
                new Carro("FOR7A94", "New Fiesta", 39500, 4);
        exibir(carro1);
        System.out.println("\n" + "-".repeat(80) + "\n");

        Moto moto1 =
                new Moto("FVSB109", "Yamaha Fazer", 15500,250);
        exibir(moto1);
        System.out.println("\n" + "-".repeat(80) + "\n");

        Caminhao caminhao1 =
                new Caminhao("FIZ9129", "Scania S770", 1600000,3);
        exibir(caminhao1);
        System.out.println("\n" + "-".repeat(80) + "\n");

        //Adicionar o veiculo no vetor
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(moto1);
        veiculos.add(caminhao1);

        //Calcular total do imposto pago
        double total = 0;

        for (Veiculo veiculo : veiculos){
            total += veiculo.calcularImposto();
        }

        System.out.println("Total de impostos: R$" + Math.round(total));


    }
}



