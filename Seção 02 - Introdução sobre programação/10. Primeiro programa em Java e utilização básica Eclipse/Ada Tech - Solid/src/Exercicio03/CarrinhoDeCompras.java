package Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<String> itens = new ArrayList<>();
    private double pesoTotal;
    public void adicionarItem(String item, double peso) {
        itens.add(item);
        pesoTotal += peso;
    }
}
