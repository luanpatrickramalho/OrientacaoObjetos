package br.com.letscode.poo.enums;

public enum TipoJornadaEmpregadoEnum {
    PERIODO_COMPLETO("Período Completo"),
    MEIO_PERIODO("Meio Período");

    private final String descricao;

    TipoJornadaEmpregadoEnum(String descricao) { this.descricao = descricao; }

    public String getDescricao() { return this.descricao; }
}