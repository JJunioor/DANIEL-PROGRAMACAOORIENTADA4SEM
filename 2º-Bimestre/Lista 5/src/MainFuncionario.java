import exe01.Funcionario;
import exe01.FuncionarioCLT;
import exe01.FuncionarioPJ;

import java.util.ArrayList;
import java.util.List;

public class MainFuncionario{
    public static void main(String[] args){

        FuncionarioCLT CLT = new FuncionarioCLT("Jalisson", 1839);
        FuncionarioPJ PJ = new FuncionarioPJ("Melissa", 5000);

        List<Funcionario> lista = new ArrayList<>();
        lista.add(CLT);
        lista.add(PJ);

        System.out.println(lista);
    }
}