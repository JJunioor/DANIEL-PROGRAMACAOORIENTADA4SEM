package exe0;

public class Motor {
    private int potencia;
    private boolean ligada;

    //construtor sem parametro
    public Motor() {
    }

    //construtor com parametro
    public Motor(int potencia, boolean ligada) {
        this.potencia = potencia;
        this.ligada = ligada;
    }

    // get e setter
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    //to string (exibe)
    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", ligada=" + ligada +
                '}';
    }
}
