package exe03;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculoEletrico {
    public static void main(String[] args) {
        List<VeiculoEletrico> veiculos = new ArrayList<>();
        veiculos.add(new CarroEletrico("Tesla Model 3"));
        veiculos.add(new PatineteEletrico("Xiaomi Mi Scooter"));

        System.out.println("Movimentando Veículos");
        for (VeiculoEletrico v : veiculos) {
            v.mover();
        }

        System.out.println("\nCarregando Baterias");
        for (VeiculoEletrico v : veiculos) {
            if (v instanceof Eletrico) {
                ((Eletrico) v).carregarBateria();
            }
        }
    }
}
