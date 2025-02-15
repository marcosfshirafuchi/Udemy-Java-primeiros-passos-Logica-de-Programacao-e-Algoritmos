package Exercicio01;

public abstract class Pagamento {

    private int codigo;
    private double valor;
    TipoPagamento tipoPagamento;

    public Pagamento(int codigo, double valor, TipoPagamento tipoPagamento) {
        this.codigo = codigo;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
