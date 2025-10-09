package exe03;

public class CarroEletrico extends VeiculoEletrico implements Eletrico {

    public CarroEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println(modelo + " está se movendo silenciosamente como um carro elétrico.");
    }

    @Override
    public void carregarBateria() {
        System.out.println(modelo + " está carregando a bateria no carregador rápido.");
    }
}
