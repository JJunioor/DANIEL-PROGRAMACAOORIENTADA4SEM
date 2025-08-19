import exe2.ContaBancaria;

import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        // Criar a primeira conta usando construtor vazio


        System.out.print("\n");       ContaBancaria obj1 = new ContaBancaria();
        obj1.titular = "Jalisson Junior";
        obj1.numero = "0102 1234 5678 9874";
        obj1.saldo = -5; // saldo negativo para testar regras
        obj1.situacao = true; // conta inicialmente ativa
        obj1.exibe(); // mostrar estado inicial da conta
        System.out.print("\n");

        System.out.print("\n");
        obj1.desativar(); // tenta desativar a conta
        System.out.print("\n");

        System.out.print("\n");
        obj1.ativar(); // tenta ativar novamente
        System.out.print("\n");

        System.out.print("\n");
        obj1.depositar(1500); // deposita um valor na conta
        System.out.print("\n");

        System.out.print("\n");
        obj1.sacar(1500); // saca um valor da conta
        System.out.print("\n");

        // Criar a segunda conta usando construtor completo
        ContaBancaria obj2 = new ContaBancaria("Maria Silva", "0203 5678 1234 4567", 500, true);

        // Mostrar estado inicial das contas
        System.out.println("Estado inicial das contas:");
        obj1.exibe();
        System.out.println();
        obj2.exibe();
        System.out.println("\n----------------------\n");

        // Depositar na primeira conta via entrada do usuário
        System.out.println("Informe valor para depositar na primeira conta:");
        double valorDeposito = entrada.nextDouble();
        obj1.depositar(valorDeposito);
        System.out.println("\n");

        // Sacar da primeira conta via entrada do usuário
        System.out.println("Informe valor para sacar da primeira conta:");
        double valorSaque = entrada.nextDouble();
        obj1.sacar(valorSaque);
        System.out.println("\n");

        // Transferir da primeira conta para a segunda via entrada do usuário
        System.out.println("Informe valor para transferir da primeira para a segunda conta:");
        double valorTransferencia = entrada.nextDouble();
        obj1.transferir(obj2, valorTransferencia);
        System.out.println("\n");

        // Mostrar estado final das contas
        System.out.println("Estado final das contas:");
        obj1.exibe();
        System.out.println("\n");
        obj2.exibe();
        System.out.println("\n");

    }
}
