package br.com.letscode.projetoCantina.interfaces;

public interface ICardapio {
    void iniciaCardapio();
    void listaProdutos();
    double getPreco(int idProduto);
    String getProduto(int idProduto);
}
