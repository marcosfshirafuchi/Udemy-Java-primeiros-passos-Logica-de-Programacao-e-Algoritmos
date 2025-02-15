package Exercicio02;

public enum TipoPromocao {
    NATAL("natal"),
    BLACK_FRIDAY("black_friday");
    String nomeDaPromocao;

    TipoPromocao(String nomeDaPromocao) {
        this.nomeDaPromocao = nomeDaPromocao;
    }

    public String getNomeDaPromocao() {
        return nomeDaPromocao;
    }

    public void setNomeDaPromocao(String nomeDaPromocao) {
        this.nomeDaPromocao = nomeDaPromocao;
    }
}
