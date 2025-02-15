package Exercicio01;

public enum TipoPagamento {
    CARTAO("Cartão"),PAYPAL("PayPal");

    String nomeDoPagamento;

    TipoPagamento(String nomeDoPagamento) {
        this.nomeDoPagamento = nomeDoPagamento;
    }

    public String getNomeDoPagamento() {
        return nomeDoPagamento;
    }
}
