package exe0;

public class Carro {

    //Variaveis da class
    public int ano;
    public float velocidade;
    public boolean motor;
    public String marca, modelo;

    // Método construtores
    // Sempre que definir um construtor com parâmetros, será necessário declarar outro construtor
    public  Carro()
    {

    }
    public Carro(String ma, String mo, int an, boolean mt, float ve)
    {
        this.marca = ma;
        this.modelo = mo;
        this.ano = an;
        this.motor = mt;
        this.velocidade = ve;
    }

    //Variaveis primitivas são utilizadfas sem a primeira letra em
    //maiúsculo, já variaveis que são class, deverá ser em maiúsculo a primeira letra.

    // Métodoa de instância
    public void exibe()
    {
        // THIS representa o objeto que chamou o método / função
        System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " +
                this.ano + "\nMotor: " + this.motor + "\nVelocidade: " + this.velocidade);
    }

    public void desligar()
    {
        if ( this.motor )
        {
            this.motor = false;
            this.velocidade = 0;
            this.exibe();
        }
    }
    public void ligar()
    {
        if ( !this.motor )
        {
            this.motor = true;
            this.exibe();
        }
    }

    public void acelerar(float x)
    {
        if (this.motor)
        {
            this.velocidade += x;
            this.exibe();
        }
    }

    public void frear(float x)
    {
        if (this.motor)
        {
            if (this.velocidade - x >= 0) // ou velocidade >= x
            {
                this.velocidade -= x;
                this.exibe();
            }
            else
            {
                System.out.println("Não foi possível frear" + x + ", pois a velocidade ficará menor que 0\nTente novamente! : (");
            }
        }
    }
}
