package exe0;

public class Departamento {
    private String nome, sigla;
    //botão direito generate Constructor,

    //sem parâmetro
    public Departamento() {
    }

    //com parâmetro
    public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    //Getter e Setter, selecionar a opção que gera juntos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    //metodo exibe, metodo padrão para exibir toString, dentro de Generate
    //Override conceito de herança que não aprendemos ainda
    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
