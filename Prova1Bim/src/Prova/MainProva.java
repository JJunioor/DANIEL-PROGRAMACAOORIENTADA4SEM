package Prova;

public class MainProva {
    public static void main(String[] args) {

        Exposicao ex = new Exposicao("Comemoração 30 anos");

        Pintura pintura1 =
                new Pintura("Monalisa", "Leonardo Davinci", "Óleo sobre a tela");

        Escultura escultura1 =
                new Escultura("Mesa Santa Ceia", "São José", "Mármore Brilhante");

        Instalacao instalacao1 =
                new Instalacao("Fonte infinita", "Elon Musk", true);


        ex.addObra(pintura1);
        ex.addObra(escultura1);
        ex.addObra(instalacao1);
        ex.removeObra("Fonte infinita");
        System.out.println(ex.toString());

    }
}




