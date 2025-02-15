package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Double> precos = new ArrayList<>();
    public void adicionarItem(double preco) {
        precos.add(preco);
    }


}
