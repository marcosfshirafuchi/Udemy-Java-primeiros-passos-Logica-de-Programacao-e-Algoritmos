package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<String> itens = new ArrayList<>();
    public void adicionarItem(String item) {
        itens.add(item);
    }
}
