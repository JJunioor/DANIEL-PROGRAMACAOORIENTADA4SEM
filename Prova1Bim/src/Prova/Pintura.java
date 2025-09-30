package Prova;

public class Pintura extends ObraArte{
    private String tecnica;

    public Pintura() {
        super();
    }

    public Pintura(String titulo, String artista, String tecnica) {
        super(titulo, artista);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public String descrever() {
        return "Pintura feita em técnica: " + this.tecnica;
    }

    @Override
    public String toString() {
        return "\nPintura{" + super.toString() + "\n}";
    }

}
