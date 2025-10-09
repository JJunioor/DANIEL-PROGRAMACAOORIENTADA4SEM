package exe03;

public class PatineteEletrico extends VeiculoEletrico implements Eletrico {

    public PatineteEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println(modelo + " está se movendo pelo parque.");
    }

    @Override
    public void carregarBateria() {
        System.out.println(modelo + " está carregando a bateria na tomada comum.");
    }
}

