package Exercicio03;

public class Envio {
    private CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    public Envio(CarrinhoDeCompras carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public double calcularFrete() {
        if (pesoTotal < 5) {
            return 10.0;
        }
        else if (pesoTotal < 10) {
            return 20.0;
        }
    }
}

