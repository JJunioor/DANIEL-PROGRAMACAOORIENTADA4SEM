import exe0.Carro;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main0
{
    public static void main(String[] args)
    {

        //cria um objeto da classe Carro
        Carro obj1 = new Carro();
        obj1.marca = "FORD";
        obj1.modelo = "New Fiesta";
        obj1.ano = 2014;
        obj1.motor = true;
        obj1.velocidade = 160;

        // Comando de saida manual
        System.out.println("Marca: " + obj1.marca + "\nModelo: " + obj1.modelo + "\nAno: " +
                obj1.ano + "\nMotor: " + obj1.motor + "\nVelocidade: " + obj1.velocidade);

        System.out.print("\n");

        //Solicitado para desligar o carro por meio de uma função "DESLIGAR"
        obj1.desligar();
        System.out.print("\n");

        //Solicitado para ligar o carro por meio de uma função "LIGAR"
        obj1.ligar();
        System.out.print("\n");

        // Método para acelerar o carro em X unidades
        obj1.acelerar(20);
        System.out.print("\n");

        // Método para frear o carro em X unidades
        obj1.frear(25);
        System.out.print("\n");

        // Comando de entrada e criação de novo objeto Carro
        // Scanner é utilizado para entrada de dados, porém é um pacote que deve ser improtado/baixar
        // import java.util.Scanner;
        Carro obj2 = new Carro();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a Marca do Carro: ");
        obj2.marca = entrada.next();
        System.out.println("Informe o Modelo do Carro: ");
        obj2.modelo = entrada.next();
        System.out.println("Informe o Ano do Carro: ");
        obj2.ano = entrada.nextInt();
        System.out.println("Informe o Motor do Carro: ");
        obj2.motor = entrada.nextBoolean();
        System.out.println("Informe a Velocidade do Carro: ");
        obj2.velocidade = entrada.nextFloat();

        System.out.print("\n");
        obj2.exibe();
        System.out.print("\n");

        // Comando de saida manual, sem utilização do exibe
        //System.out.println("Marca: " + obj2.marca + "\nModelo: " + obj2.modelo + "\nAno: " +
        //        obj2.ano + "\nMotor: " + obj2.motor + "\nVelocidade: " + obj2.velocidade);

        // Método o objeto utilizando o método construtor
        Carro obj3 = new Carro("Ferrari", "F40", 2025, true, 320);
        obj3.exibe();

    }


}
