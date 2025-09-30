package exe1;

public class Lampada
{

    //Definir varíaveis
    public String marca;
    public boolean ligada;
    public int brilho; //0 a 100
    public String cor; //Branca ou Amarela

    // Método construtores
    // Sempre que definir um construtor com parâmetros, será necessário declarar outro construtor
    public Lampada()
    {

    }

    public Lampada(String marca, boolean ligada, int brilho, String cor )
    {
        this.marca = marca;
        this.ligada = ligada;
        this.brilho = brilho;
        this.cor = cor;
    }

// Método de exibe - imprimir dados
    public void exibe()
    {
        System.out.println("Marca: " + marca + "\nLâmpada: " + ligada + "\nBrilho: "
                + brilho + "\nCor: " + cor );
    }

    public void ligar()
    {
        if ( !this.ligada )
        {
            this.ligada = true;
            this.exibe();
        }
        else
        {
            System.out.println("Lâmpada já esta ligada!");
        }
    }

    public void desligar()
    {
        if ( this.ligada)
        {
            this.ligada = false;
            this.brilho = 0;
            this.exibe();
        }
    }

    public void ajustarbrilho(int valor)
    {
        if (this.ligada)
        {
            if ( valor >= 0 && valor <= 100 )
            {
                this.brilho = valor;
                this.exibe();
            }
            else
            {
                System.out.println("Não foi possível trocar brilho pois o valor informado (" + valor + "), não está entre 0 e 100\nTente novamente! : (");
            }
        }
    }

    public void mudarcor(String x)
    {
        if ( this.ligada)
        {
            this.cor = x;
            this.exibe();
        }
        else
        {
            System.out.println("Não foi possível trocar a cor, pois a lâmpada está desligada! \nTente novamente! : (");
        }
    }

}