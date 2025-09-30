import exe1.Lampada;

import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        //Criar obj1 com valores preenchidos
        Lampada obj1 = new Lampada();
        obj1.marca = "Philips";
        obj1.ligada = true;
        obj1.brilho = 75;
        obj1.cor = "Branca";

        System.out.print("\n");
        obj1.exibe();
        System.out.print("\n");

        System.out.print("\n");
        obj1.ligar();
        System.out.print("\n");

        System.out.print("\n");
        obj1.desligar();
        System.out.print("\n");

        System.out.print("\n");
        obj1.ligar();
        System.out.print("\n");

        System.out.print("\n");
        obj1.ajustarbrilho(5);
        System.out.print("\n");

        System.out.print("\n");
        obj1.mudarcor("Amarela");
        System.out.print("\n");

        //cria um objeto com  Carro
        Lampada obj2 = new Lampada();
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n>>> Informe os dados da segunda lâmpada:");
        System.out.println("Informe a Marca da Lâmpada: ");
        obj2.marca = entrada.next();
        System.out.println("Informe se a Lâmpada está ligada (True/False): ");
        obj2.ligada = entrada.nextBoolean();
        System.out.println("Informe o Brilho da Lâmpada (0-100): ");
        obj2.brilho = entrada.nextInt();
        System.out.println("Informe a Cor da Lâmpada (Branca ou Amarela): ");
        obj2.cor = entrada.next();


        System.out.print("\n");
        obj2.exibe();
        System.out.print("\n");

        // Método o objeto utilizando o método construtor
        Lampada obj3 = new Lampada("SempToshiba",  true,  50, "Azul");
        obj3.exibe();
    }
}

