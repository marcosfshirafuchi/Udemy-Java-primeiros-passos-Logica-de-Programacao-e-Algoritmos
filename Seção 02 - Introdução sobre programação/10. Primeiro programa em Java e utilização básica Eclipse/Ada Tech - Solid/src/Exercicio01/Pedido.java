package Exercicio01;

public class Pedido {
    private int numeroDoPedido;
    private CarrinhoDeCompras carrinhoDeCompras;
    private Pagamento pagamento;

    public Pedido(int numeroDoPedido, CarrinhoDeCompras carrinhoDeCompras, Pagamento pagamento) {
        this.numeroDoPedido = numeroDoPedido;
        this.carrinhoDeCompras = carrinhoDeCompras;
        this.pagamento = pagamento;
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public CarrinhoDeCompras getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(CarrinhoDeCompras carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
