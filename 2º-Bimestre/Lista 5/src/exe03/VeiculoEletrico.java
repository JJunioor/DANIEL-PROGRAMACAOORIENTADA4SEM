package exe03;

public abstract class VeiculoEletrico {
    protected String modelo;

    public VeiculoEletrico(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void mover();

    public void exibirModelo() {
        System.out.println("Modelo: " + modelo);
    }
}
