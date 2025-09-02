package exe0;

public class Carro {
    private String modelo;
    private Motor motor;

    //generate criar none, sem parametros
    public Carro() {
    }

    //generate tivemos que mudar e colocar a potencia e ligado true
    public Carro(String modelo, int potencia, boolean ligado) {
        this.modelo = modelo;
        this.motor = new Motor(potencia, true);
    }

    //Getter e Setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    //precisou corrigir, incluir potencia e ligado
    public void setMotor(int potencia, boolean ligado) {
        this.motor = new Motor(potencia, ligado);
    }

    //toString
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }
}
