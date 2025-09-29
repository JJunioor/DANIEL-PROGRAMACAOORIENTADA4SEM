package Prova;

public class ObraArte {
    protected String titulo;
    protected String artista;

    public ObraArte() {
    }

    public ObraArte(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String descrever(){
        return "Ainda não sei qual obra de arte eu sou";
    }

    @Override
    public String toString() {
        return "\nObraArte{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", descrever=" + descrever() +
                '}';
    }
}