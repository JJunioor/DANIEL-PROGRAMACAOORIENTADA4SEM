package exe02;

import java.util.ArrayList;
import java.util.List;

public class MainPagamento {
    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito());
        pagamentos.add(new Pix());

        double[] valores = {100.0, 250.0};

        for (int i = 0; i < pagamentos.size(); i++) {
            pagamentos.get(i).autorizar(valores[i]);
        }
    }
}
