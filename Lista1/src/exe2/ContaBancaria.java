package exe2;

public class ContaBancaria //Nome composto coloca iniciais como maiúscula
{
    //Definir varíaveis
    public String titular;
    public String numero;
    public double saldo;
    public boolean situacao;


    public ContaBancaria()
    {

    }

    public ContaBancaria(String titular, String numero, double saldo, boolean situacao)
    {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.situacao = situacao;
    }

    public void exibe()
    {
        String numeroMascarado = "****" + numero.substring(4); // pega do 5º caractere até o final
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numeroMascarado);
        System.out.println("Saldo: " + saldo);
        System.out.println("Situação: " + situacao);
    }

    public void desativar()
    {
        if ( this.situacao )
        {
            if (this.saldo >= 0)
            {
                this.situacao = false;
                this.exibe();
            }
            else
            {
                System.out.println("Conta não pode ser DESATIVADA pois saldo é menor que 0!");
            }
        }
        else
        {
            System.out.println("Conta já está DESATIVADA");
        }
    }

    public void ativar()
    {
        if (!this.situacao)
        {
            this.situacao = true;
            System.out.println("Conta ativada com SUCESSO!\n");
            this.exibe();
        }
        else
        {
            System.out.println("Conta já se encontra ATIVADA!");
        }
    }

    public void depositar(double valor)
    {
        if ( this.situacao )
        {
            if( valor > 0)
            {
                this.saldo += valor;
                System.out.println("\nDéposito realizado com SUCESSO!\n");
                this.exibe();
            }
            else
            {
                System.out.println("Valor que deseja depositar é menor ou igual a 0!");
            }
        }
        else
        {
            System.out.println("Operação cancelada, conta se encontra DESATIVADA!");
        }
    }

    public boolean sacar(double valor)
    {
        if ( valor > 0)
        {
            if ( this.situacao)
            {
                if ( valor <= this.saldo )
                {
                    this.saldo = this.saldo - valor;
                    System.out.println("\nSaque realizado com SUCESSO!\n");
                    this.exibe();
                    return true;
                }
                else
                {
                    System.out.println("Valor que deseja sacar é maior do que o saldo que possui em conta!");
                    return false;
                }
            }
            else
            {
                System.out.println("A sua conta bancária se encontra em situação DESATIVADA");
                return false;
            }
        }
        else
        {
            System.out.println("Valor que deseja sacar deve ser MAIOR que 0");
            return false;
        }
    }

    public void transferir(ContaBancaria destino, double valor)
    {
        if ( this.sacar(valor))// tira da conta de origem
        {
            destino.depositar(valor);// coloca na conta destino
            System.out.println("\nTransferência realizada com SUCESSO!\n");
        }
    }


}
