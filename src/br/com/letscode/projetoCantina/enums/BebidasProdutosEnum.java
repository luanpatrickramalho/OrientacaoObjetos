package br.com.letscode.projetoCantina.enums;

public enum BebidasProdutosEnum {
    REFRIGERANTE("Refrigerante"),
    SUCO("Suco"),
    VINHO("Vinho");

    private final String descricao;

    BebidasProdutosEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
