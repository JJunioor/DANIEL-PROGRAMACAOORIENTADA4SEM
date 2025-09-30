package Prova;

public class Instalacao extends ObraArte{
    boolean interativa;

    public Instalacao() {
        super();
    }

    public Instalacao(String titulo, String artista, boolean interativa) {
        super(titulo, artista);
        this.interativa = interativa;
    }

    public boolean isInterativa() {
        return interativa;
    }

    public void setInterativa(boolean interativa) {
        this.interativa = interativa;
    }

    @Override
    public String descrever() {
        return this.interativa ?" Instalação Interativa":" Instalação  Não Interativa";
    }

    @Override
    public String toString() {
        return "\nInstalacao{" + super.toString() + "\n}";
    }
}
