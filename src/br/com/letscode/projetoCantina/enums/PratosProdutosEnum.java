package br.com.letscode.projetoCantina.enums;

public enum PratosProdutosEnum {
    PASTA("Pasta"),
    LASANHA("Lasanha"),
    POLPETONE("Polpetone");

    private final String descricao;

    PratosProdutosEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
